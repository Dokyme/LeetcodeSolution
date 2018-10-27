class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        for(int n:nums){sum+=n;}
        if(sum%k!=0){return false;}
        return helper(nums,new int[k],nums.length-1,sum/k);
    }
    
    public boolean helper(int[] nums,int[] groupSum,int ni,int sum){
        if(ni==-1){
            for(int s:groupSum){
                if(s!=sum){
                    return false;
                }
            }
            return true;
        }
        int num=nums[ni];
        for(int i=0;i<groupSum.length;i++){
            if(groupSum[i]+num<=sum){
                groupSum[i]+=num;
                if(helper(nums,groupSum,ni-1,sum)) return true;
                groupSum[i]-=num;   
            }
        }
        return false;
    }
}