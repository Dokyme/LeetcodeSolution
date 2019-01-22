/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead=new ListNode(0);
        ListNode node=newHead;
        newHead.next=head;
        while(node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }

        return newHead.next;
    }
}