class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    
    public int rob(int[] nums,int lo,int hi){
        int N=nums.length;
        int cur=0,prev=0,prev2=0;
        for(int i=lo;i<=hi;i++){
            cur=Math.max(prev,prev2+nums[i]);
            prev2=prev;
            prev=cur;
        }
        return cur;
    }
}