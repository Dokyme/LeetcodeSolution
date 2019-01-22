class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0){
            return new ArrayList();
        }
        int[] index=new int[n];
        int[] dp=new int[n];
        Arrays.fill(index,-1);
        Arrays.fill(dp,0);
        int globalMaxSetSize=Integer.MIN_VALUE;
        int globalMaxSetIndex =0;
        dp[0]=1;
        for(int i=1;i<n;i++){
            int maxSetSize=1;
            int maxSetIndex = -1;
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0 && dp[j]+1 > maxSetSize){
                    maxSetSize = dp[j] + 1;
                    maxSetIndex = j;
                }
            }
            dp[i] = maxSetSize;
            if(maxSetSize > globalMaxSetSize){
                globalMaxSetIndex = i;
                globalMaxSetSize = maxSetSize;
            }
            index[i] = maxSetIndex;
        }
        List<Integer> res=new ArrayList();
        for(int i=globalMaxSetIndex;i!=-1;i=index[i]){
            res.add(0,nums[i]);
        }
        return res;
    }
}