class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum=new int[10003];
        for(int num:nums){
            sum[num]+=num;
        }
        for(int i=2;i<=10002;i++){
            sum[i]=Math.max(sum[i-1],sum[i-2]+sum[i]);
        }
        return sum[10002];
    }
}