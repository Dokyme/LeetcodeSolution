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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null){
            return true;
        }else if(s!=null&&t!=null){
            return match(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
        }else{
            return false;
        }
    }
    
    private boolean match(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }else if(s!=null&&t!=null){
            return s.val==t.val&&match(s.left,t.left)&&match(s.right,t.right);
        }else{
            return false;
        }
    }
}