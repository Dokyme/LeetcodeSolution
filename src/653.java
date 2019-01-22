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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet();
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node!=null){
                if(set.contains(k-node.val)){
                    return true;
                }
                set.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return false;
    }
}