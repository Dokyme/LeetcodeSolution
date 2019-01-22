class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==0){
            return 0;
        }
        Arrays.sort(pairs,(a,b)->(a[0]-b[0]));
        int[] dp=new int[pairs.length];
        for(int i=0;i<pairs.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(pairs[j][1] < pairs[i][0]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp[pairs.length-1];
    }
}

class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==0){
            return 0;
        }
        Arrays.sort(pairs,(a,b)->(a[1]-b[1]));
        int pre=pairs[0][1];
        int cnt=1;
        for(int[] pair:pairs){
            if(pair[0]>pre){
                cnt++;
                pre=pair[1];
            }
        }
        return cnt;
    }
}