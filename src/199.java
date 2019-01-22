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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList();
        LinkedList<TreeNode> queue=new LinkedList();
        int lastLevel=1;
        if(root==null){
            return res;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int t=0;
            res.add(queue.get(lastLevel-1).val);
            for(int i=0;i<lastLevel;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                    t++;
                }
                if(node.right!=null){
                    queue.offer(node.right);
                    t++;
                }
            }
            lastLevel=t;
        }
        return res;
    }
}