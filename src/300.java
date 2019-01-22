class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=1;
        int[] lis=new int[nums.length];
        lis[0]=1;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(max,lis[j]);
                }
            }
            lis[i]=max+1;
            res=Math.max(res,max+1);
        }
        return res;
    }
}