/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cursor=new ListNode(0);
        ListNode first=cursor;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cursor.next=l1;
                l1=l1.next;
            }else{
                cursor.next=l2;
                l2=l2.next;
            }
            cursor=cursor.next;
        }
        if(l1!=null)
            cursor.next=l1;
        else if(l2!=null)
            cursor.next=l2;
        return first.next;
    }
}