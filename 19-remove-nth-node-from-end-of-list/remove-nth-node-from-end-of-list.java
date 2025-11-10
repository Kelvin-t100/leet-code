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
  ListNode t=new ListNode(0);
  t.next=head;
  ListNode c=t;
  ListNode p=t;
  for(int i=0;i<=n;i++){
    p=p.next;
  }
  while(p!=null){
  c=c.next;
  p=p.next;}
  c.next=c.next.next;
  return t.next;
    }
}