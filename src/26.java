class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int s=1,t=1;
        for(;t<nums.length;t++){
            while(s<nums.length&&nums[s]==nums[t-1]){s++;}
            if(s==nums.length){
                break;
            }
            nums[t]=nums[s];
            s++;
        }
        return t;
    }
}