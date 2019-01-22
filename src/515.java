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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> levelMax=new ArrayList();
        Queue<TreeNode> q=new LinkedList();
        int last=1;
        if(root==null){
            return levelMax;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int c=0;
            int localMax=Integer.MIN_VALUE;
            for(int i=0;i<last;i++){
                TreeNode node=q.poll();
                localMax=Math.max(node.val,localMax);
                if(node.left!=null){
                    c++;
                    q.offer(node.left);
                }
                if(node.right!=null){
                    c++;
                    q.offer(node.right);
                }
            }
            last=c;
            levelMax.add(localMax);
        }
        return levelMax;
    }
}