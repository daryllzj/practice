package leetcode.Easy;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(4);

        ListNode current = mergeTwoLists(a,b);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null){

            if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }


        if (list1 == null){
            return list2;
        } else {
            return list1;
        }
    }


     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int val) { this.val = val; }

     }

}
