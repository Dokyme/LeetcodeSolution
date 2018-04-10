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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack=new Stack();
        TreeNode pcur=null,qcur=null;
        if(p==null&&q==null){
            return true;
        }else if(p!=null&&q!=null){
            stack.push(p);
            stack.push(q);
        }else{
            return false;
        }
        
        while(!stack.empty()){
            pcur=stack.pop();
            qcur=stack.pop();
            if(pcur==null&&qcur==null){
                continue;
            }else if(pcur!=null&&qcur!=null&&pcur.val!=qcur.val){
                return false;
            }else if((pcur==null&&qcur!=null)||(pcur!=null&&qcur==null)){
                return false;
            }else{
                stack.push(pcur.left);
                stack.push(qcur.left);
                stack.push(pcur.right);
                stack.push(qcur.right);
            }
        }
        return true;
    }
}