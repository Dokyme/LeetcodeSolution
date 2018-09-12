class Solution {
    public int maxProfit(int[] prices) {
        int N=prices.length;
        if(N<1){
            return 0;
        }
        int[] s0=new int[N];
        int[] s1=new int[N];
        int[] s2=new int[N];
        s0[0]=0;
        s1[0]=-prices[0];
        s2[0]=0;
        for(int i=1;i<N;i++){
            s0[i]=Math.max(s0[i-1],s2[i-1]);
            s1[i]=Math.max(s0[i-1]-prices[i],s1[i-1]);
            s2[i]=s1[i-1]+prices[i];
        }
        return Math.max(s2[N-1],s0[N-1]);
    }
}