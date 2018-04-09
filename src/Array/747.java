class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        for(int num:nums){
            if(num!=nums[max]&&nums[max]<num*2){
                return -1;
            }
        }
        return max;
    }
}