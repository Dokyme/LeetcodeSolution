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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left),right=minDepth(root.right);
        if(root.left!=null&&root.right!=null){
            return Math.min(left,right)+1;
        }
        if(root.left!=null){
            return left+1;
        }else{
            return right+1;
        }
    }
}