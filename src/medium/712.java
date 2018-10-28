class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        char[] chs1=s1.toCharArray();
        char[] chs2=s2.toCharArray();
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        //dp[0]表示空数组
        for(int i=0;i<s1.length();i++){
            dp[i+1][0]=dp[i][0]+chs1[i];
        }
        for(int j=0;j<s2.length();j++){
            dp[0][j+1]=dp[0][j]+chs2[j];
        }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                int cost=chs1[i-1]+chs2[j-1];
                if(chs1[i-1]==chs2[j-1]){
                     cost=0;
                }
                dp[i][j]=Math.min(dp[i][j-1]+chs2[j-1],dp[i-1][j]+chs1[i-1]);
                dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]+cost);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}