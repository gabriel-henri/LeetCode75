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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head = head.next;
            return head;
        }

        ListNode onebyone_prev = head;
        ListNode onebyone = head;
        ListNode twobytwo = head;

        while(twobytwo != null && twobytwo.next != null){
            onebyone_prev = onebyone;
            onebyone = onebyone.next;
            twobytwo = twobytwo.next.next;
        }
        onebyone_prev.next = onebyone.next;

        return head;
    }
}