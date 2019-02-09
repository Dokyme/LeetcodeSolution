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
        int carry=0;
        ListNode last=new ListNode(0);
        ListNode head=last;
        while(l1!=null&&l2!=null){
            carry=l1.val+l2.val+carry;
            last.next=new ListNode(carry%10);
            last=last.next;
            carry/=10;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null){
            while(l1!=null){
                carry=l1.val+carry;
                last.next=new ListNode(carry%10);
                last=last.next;
                carry/=10;
                l1=l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                carry=l2.val+carry;
                last.next=new ListNode(carry%10);
                last=last.next;
                carry/=10;
                l2=l2.next;
            }
        }
        if(carry!=0){
            last.next=new ListNode(carry);
        }
        return head.next;
    }
}