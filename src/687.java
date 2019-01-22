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
    private int max=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,root.val);
        return max;
    }
    
    public int dfs(TreeNode node,int p){
        if(node==null){
            return 0;
        }
        int left=dfs(node.left,node.val);
        int right=dfs(node.right,node.val);
        max=Math.max(left+right,max);
        if(node.val==p){
            return Math.max(left,right)+1;
        }
        return 0;
    }
}