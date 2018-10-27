class Solution {
    public int countSubstrings(String s) {
        int N=s.length();
        char[] chs=s.toCharArray();
        boolean[][] dp=new boolean[N][N];
        int res=0;
        for(int i=N-1;i>=0;i--){
            for(int j=i;j<N;j++){
                dp[i][j]=chs[i]==chs[j]&&(j-i<3||dp[i+1][j-1]);
                if(dp[i][j]){
                    res++;
                }
            }
        }
        return res;
    }
}