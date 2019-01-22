/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode tail=null;//记录A链表尾节点，用于检查两个链表是否相交。
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        while(nodeA!=nodeB){
            if(nodeA.next==null){
                if(tail!=null&&tail!=nodeA){
                    return null;
                }else{
                    tail=nodeA;
                }
                nodeA=headB;
            }else{
                nodeA=nodeA.next;
            }
            if(nodeB.next==null){
                if(tail!=null&&tail!=nodeB){
                    return null;
                }else{
                    tail=nodeB;
                }
                nodeB=headA;
            }else{
                nodeB=nodeB.next;
            }
        }
        return nodeA;
    }
}