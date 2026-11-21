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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        head.val=(l1.val+l2.val)%10;
        int carry=(l1.val+l2.val)/10;
        ListNode curr=new ListNode();
        curr=head;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null){
            ListNode temp=new ListNode();
            curr.next=temp;
            temp.val=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            curr=temp;
            l1=l1.next;l2=l2.next;
        }
        while(l1!=null){
            ListNode temp=new ListNode();
            curr.next=temp;
            temp.val=(l1.val+carry)%10;
            carry=(l1.val+carry)/10;
            curr=temp;
            l1=l1.next;
        }
        while(l2!=null){
            ListNode temp=new ListNode();
            curr.next=temp;
            temp.val=(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            curr=temp;
            l2=l2.next;
        }
        if(carry!=0){
            ListNode temp=new ListNode();
            curr.next=temp;
            temp.val=1;
            curr=temp;
        }
        return head;
    }
}
