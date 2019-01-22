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
    public int findSecondMinimumValue(TreeNode root) {
        int second=Integer.MAX_VALUE;
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            if(n!=null){
                int i=n.val;
                if(i>root.val&&i<second){
                    second=i;
                }
                q.offer(n.left);
                q.offer(n.right);
            }
        }
        return second==Integer.MAX_VALUE?-1:second;
    }
}