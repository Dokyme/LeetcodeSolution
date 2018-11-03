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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        TreeNode first=root;
        if(root==null){
            return 0;
        }
        int last=1;
        q.offer(root);
        while(!q.isEmpty()){
            int c=0;
            first=q.peek();
            for(int i=0;i<last;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    c++;
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    c++;
                    q.offer(node.right);
                }
            }
            last=c;
        }
        return first.val;
    }
}