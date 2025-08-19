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
    public int getDecimalValue(ListNode head) {
        int count =0;
        int sum=0;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp2 = head;
        while(temp2.next!=null){
            sum+=Math.pow(2,count)*temp2.val;
            count--;
            temp2=temp2.next;
        }

        return sum+temp2.val*1;
    }
}