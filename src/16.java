class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=0;
        Arrays.sort(nums);
        int dif=100000;
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<dif){
                    dif=Math.abs(sum-target);
                    res=sum;
                }
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    return target;
                }
            }
        }
        return res;
    }
}