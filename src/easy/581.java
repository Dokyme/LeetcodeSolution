class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy=new int[nums.length];
        System.arraycopy(nums,0,copy,0,nums.length);
        Arrays.sort(copy);
        int left=nums.length-1,right=0;
        for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
                left=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(copy[i]!=nums[i]){
                right=i;
                break;
            }
        }
        if(left<right){
            return right-left+1;
        }else{
            return 0;
        }
    }
}