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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int t1=Math.max(maxDepth(root.left)+maxDepth(root.right),diameterOfBinaryTree(root.left));
        return Math.max(t1,diameterOfBinaryTree(root.right));
    }
    
    private int maxDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }
}