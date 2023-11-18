package leetcode.Easy;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode listNodeC = new ListNode(8);
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(1);
        listNode1.next.next = listNodeC;
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(1);
        listNode2.next.next.next = listNodeC;
        listNodeC.next = new ListNode(4);
        listNodeC.next.next = new ListNode(5);

        printList(getIntersectionNode(listNode1 , listNode2));
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
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
