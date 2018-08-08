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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> r=new ArrayList();
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        int size=q.size();
        while(size!=0){
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                sum+=n.val;
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            r.add(sum*1.0d/size);
            size=q.size();
        }
        return r;
    }
}