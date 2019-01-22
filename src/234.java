/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        int size=1;
        ListNode cursor=head;
        while((cursor=cursor.next)!=null){
            size++;
        }
        if(size<=1){
            return true;
        }
        int half=size/2;
        ListNode end=head;
        while(half-->0){
            end=end.next;
        }
        ListNode pre=null;
        ListNode cur=head;
        ListNode suc=cur;
        while(suc!=null&&suc!=end){
            suc=cur.next;
            cur.next=pre;
            pre=cur;
            cur=suc;
        }
        if(size%2!=0){
            end=end.next;
        }
        while(end!=null){
            if(pre.val!=end.val){
                return false;
            }
            end=end.next;
            pre=pre.next;
        }
        if(pre!=null){
            return false;
        }
        return true;
    }
}