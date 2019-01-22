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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums,0,nums.length-1);
    }
    
    public TreeNode constructTree(int[] nums,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid=lo+(hi-lo)/2;
        TreeNode tree=new TreeNode(1);
        tree.val=nums[mid];
        tree.left=new TreeNode(1);
        tree.right=new TreeNode(1);
        tree.left=constructTree(nums,lo,mid-1);
        tree.right=constructTree(nums,mid+1,hi);
        return tree;
    }
}