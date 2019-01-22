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
    public int countNodes(TreeNode root) {
        int l=leftDepth(root);
        int r=rightDepth(root);
        if(l==r){
            return (1<<l)-1;
        }else{
            return countNodes(root.left)+countNodes(root.right)+1;
        }
        
    }
    
    public int leftDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.left;
        }
        return depth;
    }
    
    public int rightDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.right;
        }
        return depth;
    }
}