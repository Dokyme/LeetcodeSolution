class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int o=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                o++;
            }else{
                o=1;
            }
            max=Math.max(max,o);
        }
        return max;
    }
}