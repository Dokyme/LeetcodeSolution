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
    private int sum;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum=sum;
        List<List<Integer>> res=new ArrayList();
        visit(res,new Stack(),root,0);
        return res;
    }
    
    public void visit(List<List<Integer>> res,Stack<Integer> stack,TreeNode cur,int acc){
        if(cur==null){
            return;
        }
        stack.push(cur.val);
        if(cur.left==null&&cur.right==null&&acc+cur.val==sum){
            List<Integer> list=new ArrayList(stack);
            res.add(list);
        }else{
            visit(res,stack,cur.left,acc+cur.val);
            visit(res,stack,cur.right,acc+cur.val);
        }
        stack.pop();
        return;
    }
}