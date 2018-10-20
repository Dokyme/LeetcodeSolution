class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if((sum+S)%2!=0){
            return 0;
        }else if(sum<S){
            return 0;
        }
        sum=(sum+S)/2;
        int[] dp=new int[sum+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=sum;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[sum];
    }
}