class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=Math.max(max,sum);
        for(int i=0;i<nums.length-k;i++){
            sum=sum-nums[i]+nums[i+k];
            max=Math.max(max,sum);
        }
        if(sum>max){
            max=sum;
        }
        return max*1.0/k;
    }
}