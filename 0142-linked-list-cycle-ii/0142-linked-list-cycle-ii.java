/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int len=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                len=cycleLength(head);
                break;
            }
        }
        if(len==0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        while(len>0){
            s=s.next;
            len--;
        }
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;
    }

    public int cycleLength(ListNode head) {
        ListNode slow=head,fast=head;
        while(true){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int len=1;
                fast=fast.next;
                while(fast!=slow){
                    len++;
                    fast=fast.next;
                }
                return len;
            }   
        }
    }
}