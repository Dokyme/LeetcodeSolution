/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode current=root;
        TreeLinkNode nextHead=null;
        TreeLinkNode nextCur=null;
        while(current!=null){
            while(current!=null){
                if(current.left!=null){
                    if(nextHead==null){
                        nextHead=current.left;
                        nextCur=nextHead;
                    }else
                    if(nextCur!=null){
                        nextCur.next=current.left;
                        nextCur=nextCur.next;
                    }
                }
                if(current.right!=null){
                    if(nextHead==null){
                        nextHead=current.right;
                        nextCur=nextHead;
                    }else
                    if(nextCur!=null){
                        nextCur.next=current.right;
                        nextCur=nextCur.next;
                    }
                }
                current=current.next;
            }
            current=nextHead;
            nextHead=nextCur=null;
        }
    }
}