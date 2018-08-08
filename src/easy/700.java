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
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val>val){
                root=root.left;
            }else if(root.val<val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
    }
}