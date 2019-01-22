/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,cur=null,temp=null;
        if(head==null){
            return null;
        }else{
            pre=head;
            cur=head.next;
        }
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head.next=null;
        return pre;
    }
}