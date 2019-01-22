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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList();
        if(root==null){
            return res;
        }
        path(root,res,""+root.val);
        return res;
    }
    
    private void path(TreeNode node,List<String> list,String str){
        if(node.left==null&&node.right==null){
            list.add(str);
        }
        if(node.left!=null){
            path(node.left,list,str+"->"+node.left.val);   
        }
        if(node.right!=null){
            path(node.right,list,str+"->"+node.right.val);   
        }
    }
}