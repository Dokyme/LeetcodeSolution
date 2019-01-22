/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n){
            return head;
        }
        System.out.println(m+","+n);
        ListNode headCopy = head;
        ListNode prev = null;
        int rm = m;
        while (m > 1) {
            prev = head;
            head = head.next;
            m--;
        }
        ListNode p = null, q = head, l = head.next;
        while (n >= rm) {
            q.next = p;
            p = q;
            q = l;
            if(l!=null)
                l = l.next;
            n--;
        }
        head.next = q;
        if (prev != null) {
            prev.next = p;
        } else {
            headCopy = p;
        }
        return headCopy;
    }
}