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
    public ListNode middle(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.next;
    }

    public ListNode reverse(ListNode head, ListNode end){
        if(head == null)
            return head;

        ListNode reversed = new ListNode();
        reversed = null;
        ListNode point = head;
        ListNode shadow = head;

        while(point != end){
            shadow = point;
            point = point.next;

            shadow.next = reversed;
            reversed = shadow;
        }
        return reversed;
    }

    public int pairSum(ListNode head) {
        ListNode mid = middle(head);
        ListNode beginreversed = reverse(head, mid);
        int maxim = 0;

        while(mid != null){
            if(beginreversed.val+mid.val > maxim)
                maxim = beginreversed.val+mid.val;

            beginreversed = beginreversed.next;
            mid = mid.next;
        }

        return maxim;
    }
}