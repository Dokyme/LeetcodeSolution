/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pairTail=null,first=head;
        if(first.next==null){
            return first;
        }
        while(first!=null&&first.next!=null){
            if(pairTail==null){
                //first pair
                head=first.next;
                ListNode secondNext=first.next.next;
                first.next.next=first;
                first.next=secondNext;
                pairTail=first;
                first=first.next;
            }else{
                ListNode secondNext=first.next.next;
                pairTail.next=first.next;
                first.next.next=first;
                first.next=secondNext;
                pairTail=first;
                first=first.next;
            }
        }
        return head;
    }
}