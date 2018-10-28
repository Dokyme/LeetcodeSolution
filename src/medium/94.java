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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList();
        visit(res,root);
        return res;
    }
    
    private void visit(List<Integer> res,TreeNode node){
        if(node==null){
            return;
        }
        visit(res,node.left);
        res.add(node.val);
        visit(res,node.right);
    }
}

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList();
        if(root==null){
            return res;
        }
        
        Stack<TreeNode> stack=new Stack();
        TreeNode node=root;
        while(node!=null||!stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                //node is null
                node=stack.pop();
                res.add(node.val);
                node=node.right;
            }
        }
        return res;
    }
}