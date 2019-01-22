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
    public String tree2str(TreeNode t) {
        StringBuilder builder=new StringBuilder();
        visit(t,builder);
        return builder.toString();
    }
    
    private void visit(TreeNode node,StringBuilder builder){
        if(node==null){
            return;
        }
        builder.append(node.val);
        if(node.left==null&&node.right==null){
            return;
        }
        builder.append("(");
        visit(node.left,builder);
        builder.append(")");
        if(node.right!=null){
            builder.append("(");
            visit(node.right,builder);
            builder.append(")");
        }
    }
}