class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        if(nums.length<=1){
            return false;
        }
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        boolean[] canSumTo=new boolean[sum/2+1];
        canSumTo[0]=true;
        for(int i=0;i<nums.length;i++){
            for(int j=sum/2;j>=nums[i];j--){
                canSumTo[j]=canSumTo[j]||canSumTo[j-nums[i]];
            }
        }
        return canSumTo[sum/2];
    }
}