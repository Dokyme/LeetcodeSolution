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
    public boolean isBalanced(TreeNode root) {
        return getHeight(root)!=-1;
    }
    
    public int getHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=getHeight(node.left),right=getHeight(node.right);
        if(Math.abs(left-right)>1||left==-1||right==-1){
            return -1;
        }
        return Math.max(left+1,right+1);
    }
}