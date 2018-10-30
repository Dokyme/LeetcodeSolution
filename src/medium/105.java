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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0||preorder.length!=inorder.length){
            return null;
        }
        return build(preorder,inorder,0,inorder.length-1);
    }
    
    public TreeNode build(int[] pre,int[] in,int l,int r){
        if(l==r){
            return new TreeNode(in[l]);
        }
        int v=pre[n];
        TreeNode root=new TreeNode(v);
        int i;
        for(i=l;i<=r;i++){
            if(in[i]==v){
                break;
            }
        }
        if(l<=i-1){
            ++n;
            root.left=build(pre,in,l,i-1);
        }
        if(i+1<=r){
            ++n;
            root.right=build(pre,in,i+1,r);
        }
        return root;
    }
}