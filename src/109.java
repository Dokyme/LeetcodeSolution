/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        return build(head,null);
    }
    
    private TreeNode build(ListNode head,ListNode tail){
        if(head==null){
            return null;
        }else if(head==tail){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=tail&&fast.next!=tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode t=new TreeNode(slow.val);
        t.left=build(head,slow);
        t.right=build(slow.next,tail);
        return t;
    }
}