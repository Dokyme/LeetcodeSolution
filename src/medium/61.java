/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode last=head;
        if(head==null){
            return null;
        }
        while(k-->0){
            last=last.next;
            if(last==null){
                last=head;
            }
        }
        ListNode headCopy=head;
        while(last.next!=null){
            last=last.next;
            head=head.next;
        }
        last.next=headCopy;
        ListNode newFirst=head.next;
        head.next=null;
        return newFirst;
    }
}