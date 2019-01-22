class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        char[] chs=s.toCharArray();
        for(int i=chs.length-1;i>=0;i--){
            dp[i][i]=1;
            for(int j=i+1;j<chs.length;j++){
                if(chs[i]==chs[j]){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}