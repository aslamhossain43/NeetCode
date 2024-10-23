package linked_list;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 08, 2024
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Reverse list is: " + reverseList(head));
    }

    private static ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    private static ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }
}
