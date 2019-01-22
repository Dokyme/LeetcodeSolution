class Solution {
    public int maxProduct(int[] nums) {
        int N=nums.length;
        int[] min=new int[N];
        int[] max=new int[N];
        min[0]=max[0]=nums[0];
        int res=min[0];
        for(int i=1;i<N;i++){
            min[i]=Math.min(Math.min(nums[i]*min[i-1],nums[i]*max[i-1]),nums[i]);
            max[i]=Math.max(Math.max(nums[i]*min[i-1],nums[i]*max[i-1]),nums[i]);
            res=Math.max(res,max[i]);
        }
        return res;
    }
}