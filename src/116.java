/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    private List<TreeLinkNode> list=new ArrayList();
    public void connect(TreeLinkNode root) {
        TreeLinkNode levelStart=root;
        while(levelStart!=null){
            TreeLinkNode cursor=levelStart;
            while(cursor!=null){
                if(cursor.left!=null){
                    cursor.left.next=cursor.right;
                }
                if(cursor.right!=null && cursor.next!=null){
                    cursor.right.next=cursor.next.left;
                }
                cursor=cursor.next;
            }
            levelStart=levelStart.left;
        }
    }
}