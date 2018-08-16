class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int l=0,r=nums.length-1;
        int first=nums[0];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }


            
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target&&target<=nums[mid]){
                    r=mid-1;
                    //进入递增序列的二分查找
                }else{
                    l=mid+1;
                }
            }else{
                if(nums[mid]<=target&&target<=nums[r]){
                    l=mid+1;
                    //进入递增序列的二分查找
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}