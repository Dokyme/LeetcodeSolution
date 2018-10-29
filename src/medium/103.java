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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null){
            return res;
        }
        Deque<TreeNode> deq=new LinkedList();
        deq.addLast(root);
        int prev=1;
        boolean zig=true;
        while(!deq.isEmpty()){
            int c=0;
            List<Integer> level=new ArrayList();
            for(int i=0;i<prev;i++){
                TreeNode n=zig?deq.removeFirst():deq.removeLast();
                level.add(n.val);
                if(zig){
                    if(n.left!=null){
                        c++;
                        deq.addLast(n.left);
                    }
                    if(n.right!=null){
                        c++;
                        deq.addLast(n.right);
                    }
                }else{
                    if(n.right!=null){
                        c++;
                        deq.addFirst(n.right);
                    }
                    if(n.left!=null){
                        c++;
                        deq.addFirst(n.left);
                    }
                }
            }
            prev=c;
            res.add(level);
            zig=!zig;
        }
        return res;
    }
}