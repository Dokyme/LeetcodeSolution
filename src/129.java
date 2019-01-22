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
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    
    private int sum(TreeNode node,int accu){
        if(node==null){
            return 0;
        }
        accu*=10;
        accu+=node.val;
        if(node.left==null&&node.right==null){
            return accu;
        }
        return sum(node.left,accu)+sum(node.right,accu);
    }
}