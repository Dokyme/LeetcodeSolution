/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=head,last=new ListNode(0);
        last.next=head;
        ListNode lastCopy=last;
        if(head==null){
            return null;
        }
        while(head!=null){
            while(head!=null&&head.val==last.next.val){
                head=head.next;
            }
            if(last.next.next==head){
                //distinct
                last=last.next;
                if(head==null){
                    break;
                }
            }else{
                //delete duplicates
                last.next=head;
            }
        }
        return lastCopy.next;
    }
}