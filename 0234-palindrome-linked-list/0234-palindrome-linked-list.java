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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next !=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sechalf=reverseList(slow);
        ListNode firhalf=head;
        while(sechalf!=null){
            if(sechalf.val!=firhalf.val){
                return false;
            }
            firhalf=firhalf.next;
            sechalf=sechalf.next;
        }

        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}