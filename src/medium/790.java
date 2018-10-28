class Solution {
    public int numTilings(int N) {
        final int MOD=1000_000_007;
        int[] dp=new int[1001];
        if(N==0)return 0;
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=5;
        for(int i=4;i<=N;i++){
            dp[i]=(int)((2L*dp[i-1]+dp[i-3])%MOD);
        }
        return dp[N];
    }
}