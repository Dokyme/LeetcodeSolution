class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp=new int[n+1][n+1];
        for(int j=1;j<=n;j++){
            for(int i=j;i>=1;i--){
                if(i==j){
                    dp[i][j]=0;
                }else{
                    int localMin=Integer.MAX_VALUE;
                    for(int k=i;k<=j;k++){
                        localMin=Math.min(localMin,k+Math.max((i==k?0:dp[i][k-1]),(j==k?0:dp[k+1][j])));
                    }
                    dp[i][j]=localMin;
                }
            }
        }
        return dp[1][n];
    }
}