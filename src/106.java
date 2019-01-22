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
    int n;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||inorder.length!=postorder.length){
            return null;
        }
        n=inorder.length-1;
        return build(inorder,postorder,0,inorder.length-1);
    }
    
    private TreeNode build(int[] inorder,int[] postorder,int inLeft,int inRight){
        if(inLeft==inRight){
            n--;
            return new TreeNode(inorder[inLeft]);
        }else if(inLeft>inRight){
            return null;
        }
        int rootVal=postorder[n--];
        int i=inLeft;
        for(;i<=inRight;i++){
            if(rootVal==inorder[i]){
                break;
            }
        }
        TreeNode root=new TreeNode(rootVal);
        root.right=build(inorder,postorder,i+1,inRight);
        root.left=build(inorder,postorder,inLeft,i-1);
        return root;
    }
}