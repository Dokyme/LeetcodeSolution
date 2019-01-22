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
    public boolean isValidBST(TreeNode root) {
        Integer last=null;
        Stack<TreeNode> stack=new Stack();
        TreeNode p=root;
        while(p!=null||!stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }else{
                p=stack.pop();
                if(last!=null&&last>=p.val){
                    return false;
                }
                last=p.val;
                p=p.right;
            }
        }
        return true;
    }
}