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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        int prev=1;
        if(root==null){
            return new ArrayList();
        }
        List<List<Integer>> res=new ArrayList();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList();
            int c=0;
            for(int i=0;i<prev;i++){
                TreeNode n=q.poll();
                level.add(n.val);
                if(n.left!=null){
                    c++;
                    q.offer(n.left);
                }
                if(n.right!=null){
                    c++;
                    q.offer(n.right);
                }
            }
            prev=c;
            res.add(level);
        }
        return res;
    }
}