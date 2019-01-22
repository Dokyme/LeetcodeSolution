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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList();
        }
        return makeTree(1,n);
    }
    
    private List<TreeNode> makeTree(int start,int end){
        List<TreeNode> ltn=new ArrayList();
        if(end==start){
            ltn.add(new TreeNode(start));
            return ltn;
        }else if(end<start){
            ltn.add(null);
            return ltn;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> lt=makeTree(start,i-1);
            List<TreeNode> rt=makeTree(i+1,end);
            for(TreeNode ln:lt){
                for(TreeNode rn:rt){
                    TreeNode node=new TreeNode(i);
                    node.left=ln;
                    node.right=rn;
                    ltn.add(node);
                }
            }
        }
        return ltn;
    }
}