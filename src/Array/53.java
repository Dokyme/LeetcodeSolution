class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int globalMax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxSum>0){
                maxSum=maxSum+nums[i];
            }else{
                maxSum=nums[i];
            }
            if(maxSum>globalMax){
                globalMax=maxSum;
            }
        }
        return globalMax;
    }
}