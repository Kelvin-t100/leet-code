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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t=head;
        int s=1;
        while(t.next!=null){
            t=t.next;s++;
        }
        for(int i=0;i<k%s;i++){
        ListNode temp=head;
        ListNode last=head.next;
        while(last.next!=null){
            last=last.next;
        temp=temp.next;}
          
        last.next=head;
        head=last;
        temp.next=null;
        }
        return head;
    }
}