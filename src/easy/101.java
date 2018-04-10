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
    public boolean isSymmetric(TreeNode root) {
        // return isMirror(root,root);
        TreeNode p=null,q=null;
        Queue<TreeNode> queue=new LinkedList();
        if(root==null){
            return true;
        }else{
            queue.offer(root);
            queue.offer(root);
        }
        
        while(!queue.isEmpty()){
            p=queue.poll();
            q=queue.poll();
            if(p==null&&q==null){
                continue;
            }else if((p==null&&q!=null)||(p!=null&&q==null)){
                return false;
            }else if(p.val!=q.val){
                return false;
            }else{
                queue.offer(p.left);
                queue.offer(q.right);
                queue.offer(p.right);
                queue.offer(q.left);
            }
        }
        return true;
    }
    
    // public boolean isMirror(TreeNode left,TreeNode right){
    //     if(left==null&&right==null){
    //         return true;
    //     }else if((left==null&&right!=null)||(left!=null&&right==null)){
    //         return false;
    //     }else{
    //         return left.val==right.val&&isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    //     }
    // }
}