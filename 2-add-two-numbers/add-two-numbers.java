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
        ListNode head=new ListNode(0);
        ListNode t=head;
        int carry=0,a=0;
        while(l1!=null ||l2!=null || carry!=0){
            if(l1!=null && l2!=null) {a=l1.val+l2.val+carry;carry=0;l1=l1.next;l2=l2.next;}
            else if(l2!=null){ a=l2.val+carry;l2=l2.next;carry=0;}
            else if(l1!=null){  a=l1.val+carry;l1=l1.next;carry=0;}
            else {a=carry;carry=0;}
            if(a>=10){carry =1;a%=10;}
            t.next=new ListNode(a);
            t=t.next;
        }
        return head.next;
    }
}