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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end=head;
        for(int i=0;i<n;i++){
            end=end.next;
        }
        ListNode temp=head;
        if(end==null){
            return head.next;
        }
        while(end.next!=null){
            temp=temp.next;
            end=end.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
