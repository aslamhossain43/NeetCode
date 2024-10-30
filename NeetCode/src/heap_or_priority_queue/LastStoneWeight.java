package heap_or_priority_queue;

import java.util.PriorityQueue;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 30, 2024
 */
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println("Last stone weight is: " + lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones) maxHeap.add(-stone);
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) maxHeap.add(stone1 - stone2);
         }
        return maxHeap.size() != 0 ? -maxHeap.remove() : 0;
    }
}
