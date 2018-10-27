class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==0){
            return false;
        }
        Map<Integer,Integer> mod=new HashMap();
        mod.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(k!=0){
                sum %= k;
            }
            Integer lastPos=mod.get(sum);
            if(lastPos!=null){
                if(i-lastPos>1){
                    return true;
                }
            }else{
                mod.put(sum,i);
            }
        }
        return false;
    }
}