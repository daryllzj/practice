package leetcode.Easy;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode1;

        System.out.println(hasCycle(listNode1));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;

    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
          }
    }

}
