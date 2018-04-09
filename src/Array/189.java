class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    
    public void reverse(int[] nums,int start,int end){
        int temp=0;
        for(int i=start;i<start+Math.ceil((end-start)*1.0/2);i++){
            temp=nums[i];
            nums[i]=nums[end-(i-start)];
            nums[end-(i-start)]=temp;
        }
    }
}