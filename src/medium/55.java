class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
        int n=nums.length;
        if(n==0){
            return true;
        }
        dp[n-1]=true;
        for(int i=n-2;i>=0;i--){
            for(int step=1;step <= nums[i] && i+step < n;step++){
                if(dp[i+step]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int last=n-1;
        if(n==0){
            return true;
        }
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=last){
                last=i;
            }
        }
        return last==0;
    }
}