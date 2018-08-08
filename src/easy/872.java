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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1=new LinkedList();
        Queue<Integer> q2=new LinkedList();
        dfs(root1,q1,true);
        return dfs(root2,q1,false);
    }
    
    public boolean dfs(TreeNode tree,Queue<Integer> queue,boolean b){
        Stack<TreeNode> stack=new Stack();
        while(tree!=null||!stack.isEmpty()){
            if(tree!=null){
                if(tree.left==null&&tree.right==null){
                    if(b){
                        queue.offer(tree.val);
                    }else{
                        if(!queue.poll().equals(tree.val)){
                            return false;
                        }
                    }
                }
                stack.push(tree);
                tree=tree.left;
            }else{
                TreeNode node=stack.pop();
                tree=node.right;
            }
        }
        return true;
    }
    
}