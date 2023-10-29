package leetcode.Easy;

public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        a.next.next = new ListNode(3);

        ListNode current = deleteDuplicates(a);

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        ListNode current = head;

        while (current.next != null) {

            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
        return head;
    }


     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int val) { this.val = val; }

     }

}
