class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> t=new ArrayList();
        r(res,t,candidates,target,0);
        return res;
    }
    
    public void r(List<List<Integer>> res,List<Integer> temp,int[] can,int target,int index){
        if(target==0){
            res.add(new ArrayList(temp));
            return;
        }else if(target<0){
            return;
        }
        for(int i=index;i<can.length;i++){
            temp.add(can[i]);
            r(res,temp,can,target-can[i],i);
            temp.remove(temp.size()-1);
        }
    }
}