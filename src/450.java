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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
    
    public TreeNode delete(TreeNode node,int key){
        if(node==null){
            return null;
        }
        if(node.val<key){
            node.right=delete(node.right,key);
        }else if(node.val>key){
            node.left=delete(node.left,key);
        }else{
            if(node.left==null||node.right==null){
                return node.left==null?node.right:node.left;
            }else{
                //delete min node bigger than this node
                TreeNode min=node.right;
                while(min.left!=null){
                    min=min.left;//find min node in right subtree
                }
                min.right=deleteMin(node.right);
                min.left=node.left;
                node=min;
            }
        }
        return node;
    }
    
    private TreeNode deleteMin(TreeNode node){
        if(node.left==null){
            return node.right;
        }
        node.left=deleteMin(node.left);
        return node;
    }
}