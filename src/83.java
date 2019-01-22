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
        ListNode first=head;
        ListNode last=head;
        while(head!=null){
            while(head!=null&&last.val==head.val){
                head=head.next;
            }
            last.next=head;
            last=last.next;
        }
        return first;
    }
}