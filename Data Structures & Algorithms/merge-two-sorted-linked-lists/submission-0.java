/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        return aux(result, list1, list2);
    }

    private ListNode aux(ListNode result, ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return result;
        }

        if(list1 == null || list1.val > list2.val) {
            result = list2;
            return aux(result.next, list1, list2.next);
        } else if(list2 == null || list1.val < list2.val) {
            result = list1;
            return aux(result.next, list1.next, list2);
        } else {
            result = list1;
            return aux(result.next, list1.next, list2);
        }
    }
}