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
    
    private List<Integer> sums=new ArrayList();
    private Map<Integer,Integer> map=new HashMap();
    private int appears;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        sum(root);
        int[] res=new int[sums.size()];
        for(int i=0;i<sums.size();i++){
            res[i]=sums.get(i);
        }
        return res;
    }
    
    public int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        int subtreeSum=sum(node.left)+sum(node.right)+node.val;
        map.put(subtreeSum,map.getOrDefault(subtreeSum,0)+1);
        int cnt=map.get(subtreeSum);
        if(cnt==appears){
            sums.add(subtreeSum);
        }else if(cnt>appears){
            sums.clear();
            sums.add(subtreeSum);
            appears=cnt;
        }
        return subtreeSum;
    }
}