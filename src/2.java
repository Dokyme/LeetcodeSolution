/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i1=l1,i2=l2;
        ListNode res=null,i=null;
        int carry=0;
        while(i1!=null&&i2!=null){
            if(res==null){
                int n=i1.val+i2.val+carry;
                res=i=new ListNode(n%10);
                carry=n/10;
            }else{
                int n=i1.val+i2.val+carry;
                i.next=new ListNode(n%10);
                carry=n/10;
                i=i.next;
            }
            i1=i1.next;
            i2=i2.next;
        }
        while(i1!=null){
            int n=i1.val+carry;
            i.next=new ListNode(n%10);
            i=i.next;
            carry=n/10;
            i1=i1.next;
        }
        while(i2!=null){
            int n=i2.val+carry;
            i.next=new ListNode(n%10);
            i=i.next;
            carry=n/10;
            i2=i2.next;
        }
        if(carry>0){
            i.next=new ListNode(carry);
        }
        return res;
    }
}