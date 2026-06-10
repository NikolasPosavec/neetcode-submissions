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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode next = head.next;
        ListNode prev = head;
        ListNode result = null;
        boolean first = true;
        
        while(next != null) {
            if(curr.val == val) {
                prev.next = next;
                curr = next;
                next = next.next;
            } else {
                if(first) {
                    result = curr;
                    first = false;
                }
                prev = curr;
                curr = next;
                next = next.next;
            }
        }

        return result;
    }
}