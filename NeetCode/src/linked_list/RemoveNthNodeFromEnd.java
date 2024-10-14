package linked_list;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 14, 2024
 */
public class RemoveNthNodeFromEnd {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {

        }

        @Override
        public String toString() {
            return "ListNode{" + "val=" + val + ", next=" + next + '}';
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.println("After removing node is: " + removeNthFromEnd(head, n));
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp, second = temp;
        while (n > 0) {
            second = second.next;
            n--;
        }
        while (second.next != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
        return temp.next;
    }
}
