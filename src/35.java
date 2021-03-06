class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int middle;
        while(left<=right){
            middle=left+(right-left)/2;
            if(target<nums[middle]){
                right=middle-1;
            }else if(target>nums[middle]){
                left=middle+1;
            }else{
                return middle;
            }
        }
        return left;
    }
}