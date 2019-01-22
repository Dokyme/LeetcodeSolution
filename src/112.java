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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return hasSum(root,sum);
    }
    
    public boolean hasSum(TreeNode root,int sum){
        if(root==null){
            return sum==0;    
        }
        boolean l=hasSum(root.left,sum-root.val);
        boolean r=hasSum(root.right,sum-root.val);
        if(root.left!=null&&root.right!=null){
            return l||r;
        }
        if(root.left!=null){
            return l;
        }else{
            return r;
        }
    }
}