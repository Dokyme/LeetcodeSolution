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
    public boolean hasCycle(ListNode head) {
        ListNode flag=new ListNode(0);
        ListNode backup=null;
        while(head!=null&&head!=flag){
            backup=head.next;
            head.next=flag;
            head=backup;
        }
        if(head==null){
            return false;
        }else{
            return true;
        }
    }
}