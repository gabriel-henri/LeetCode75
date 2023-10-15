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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode reversed = new ListNode();
        reversed = null;
        ListNode ponteiro = head;
        ListNode sombra = head;

        while(ponteiro != null){
            sombra = ponteiro;
            ponteiro = ponteiro.next;

            sombra.next = reversed;
            reversed = sombra;
        }
        return reversed;
    }
}