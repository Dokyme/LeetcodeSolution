class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for(i=nums.length-1;i>=0;i--){
            if(i==0){
                reverse(nums,0,nums.length-1);
                return;
            }
            if(nums[i-1]<nums[i]){
                break;
            }
        }
        int j;
        for(j=nums.length-1;j>i;j--){
            if(nums[j]>nums[i-1]){
                break;
            }
        }
        swap(nums,i-1,j);
        reverse(nums,i,nums.length-1);
    }
    
    private void reverse(int[] nums,int i,int j){
        int length=j-i+1;
        length/=2;
        for(int k=0;k<length;k++){
            swap(nums,i+k,j-k);
        }
    }
    
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}