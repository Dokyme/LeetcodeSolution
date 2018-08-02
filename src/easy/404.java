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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root,false);
    }
    
    private int sum(TreeNode node,boolean left){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null&&left){
            return node.val;
        }
        return sum(node.left,true)+sum(node.right,false);
    }
}