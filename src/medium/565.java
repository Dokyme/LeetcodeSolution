class Solution {
    public int arrayNesting(int[] nums) {
        int[] dp=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==0){
                int t=dfs(nums,dp,i);
                max=Math.max(t,max);
            }
        }
        return max;
    }
    
    private int dfs(int[] nums,int[] length,int index){
        if(length[index]!=0){
            return length[index];
        }
        if(nums[index]==-1){
            return 0;
        }
        int nextPos=nums[index];
        nums[index]=-1;
        length[index]=dfs(nums,length,nextPos)+1;
        return length[index];
    }
}