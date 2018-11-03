/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    
    private Stack<TreeNode> stack=new Stack();
    private TreeNode nextNode;

    public BSTIterator(TreeNode root) {
        if(root==null){
            nextNode=root;
            return;
        }
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
        nextNode=stack.pop();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return nextNode!=null;
    }

    /** @return the next smallest number */
    public int next() {
        int nextVal=-666;
        if(nextNode!=null){
            nextVal=nextNode.val;
        }
        TreeNode n=nextNode.right;
        while(n!=null){
            stack.push(n);
            n=n.left;
        }
        if(!stack.isEmpty())
            nextNode=stack.pop();
        else{
            nextNode=null;
        }
        return nextVal;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */