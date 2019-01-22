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
    
    private int tilt;
    
    public int findTilt(TreeNode root) {
        sum(root);
        return tilt;
    }
    
    public int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=sum(node.left);
        int right=sum(node.right);
        tilt+=Math.abs(left-right);
        return left+right+node.val;
    }
}