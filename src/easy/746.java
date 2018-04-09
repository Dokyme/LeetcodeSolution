class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] sum=new int[cost.length];
        sum[0]=cost[0];
        sum[1]=cost[1];
        int result=0;
        for(int i=2;i<cost.length;i++){
            //从i-2跨2阶到达，或从i-1跨1阶到达。
            sum[i]=Math.min(sum[i-2]+cost[i],sum[i-1]+cost[i]);
        }
        return Math.min(sum[cost.length-1],sum[cost.length-2]);
    }
}