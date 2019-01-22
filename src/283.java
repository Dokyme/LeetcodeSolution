class Solution {
    public void moveZeroes(int[] nums) {
        int cursor=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[cursor++]=nums[i];
            }
        }
        for(;cursor<nums.length;cursor++){
            nums[cursor]=0;
        }
    }
}