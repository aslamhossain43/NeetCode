package arrays_and_hashing;

import java.util.*;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 17, 2024
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("Top K frequent elements are: " + Arrays.toString(topKFrequentElements(nums, k)));
    }

    private static int[] topKFrequentElements(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) {
                //Get and remove lowest value
                pq.poll();
            }
        }
        int i = k;
        while (!pq.isEmpty()) {
            //Get and remove lowest value
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}
