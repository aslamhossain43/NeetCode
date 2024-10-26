package heap_or_priority_queue;

import java.util.PriorityQueue;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 26, 2024
 */
public class KthLargestElement {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestElement(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        KthLargestElement kthLargestElement = new KthLargestElement(k, nums);
        System.out.println("Kth element is: " + kthLargestElement.add(3));
        System.out.println("Kth element is: " + kthLargestElement.add(5));
        System.out.println("Kth element is: " + kthLargestElement.add(10));
        System.out.println("Kth element is: " + kthLargestElement.add(9));
        System.out.println("Kth element is: " + kthLargestElement.add(4));
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
