class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList();
        helper(res,candidates,new LinkedList(),0,target);
        return res;
    }
    
    private void helper(List<List<Integer>> res,int[] cans,List<Integer> tup,int cani,int sum){
        if(sum==0){
            res.add(new ArrayList(tup));
            return;
        }else if(cani>=cans.length){
            return;
        }else if(cans[cani]>sum){
            return;
        }else{
            int can=cans[cani];
            tup.add(can);
            helper(res,cans,tup,cani+1,sum-can);
            tup.remove(tup.size()-1);
            cani++;
            while(cani<cans.length&&cans[cani]==cans[cani-1]){
                cani++;
            }
            helper(res,cans,tup,cani,sum);
        }
    }
}