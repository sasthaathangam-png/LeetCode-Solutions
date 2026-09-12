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
        
        ListNode slow = head;
        ListNode fast= head;
        ListNode prev = null,del;
        for(int i=0;i<n;i++)
        {
            if(fast==null){
            return head;
            }
            fast=fast.next;
        }
      if(fast==null)
        {
        del=head;
        head=head.next;
        del.next=null;
        return head;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        slow.next=null;
        return head;
        
    } 
}