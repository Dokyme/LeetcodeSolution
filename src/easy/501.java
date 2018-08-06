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
    private int max;
    private TreeNode prev;
    private int current;
    
    public int[] findMode(TreeNode root) {
        List<Integer> list=new ArrayList();
        visit(root,list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    
    private void visit(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        visit(node.left,list);
        if(prev!=null&&node.val==prev.val){
            current++;
        }else{
            current=1;
        }
        if(current>=max){
            if(current>max){
                max=current;
                list.clear();
            }
            list.add(node.val);
        }
        prev=node;
        visit(node.right,list);
    }
}