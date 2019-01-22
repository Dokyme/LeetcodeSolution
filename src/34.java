class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[]{-1,-1};
        if(nums.length==0){
            return res;
        }
        res[0]=lowBound(nums,target);
        if(res[0]==-1||nums[res[0]]!=target){
            res[0]=-1;
            return res;
        }
        int hiNext=lowBound(nums,nums[res[0]]+1);
        if(nums[hiNext]==target){
            res[1]=hiNext;
        }else if(nums[hiNext-1]==target){
            res[1]=hiNext-1;
        }
        return res;
    }
    
    private int lowBound(int[] nums,int t){
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<t){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}