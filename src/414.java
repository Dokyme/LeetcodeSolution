class Solution {
    public int thirdMax(int[] nums) {
        int flag=7;
        int max=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if((((flag&4)==0)&&(nums[i]==max))||(((flag&2)==0)&&(nums[i]==second))||(((flag&1)==0)&&(nums[i]==third))){
                continue;
            }
            flag>>=1;
            if(nums[i]>max){
                third=second;
                second=max;
                max=nums[i];
            }else if(nums[i]>second){
                third=second;
                second=nums[i];
            }else if(nums[i]>third){
                third=nums[i];
            }
        }
        if(flag==0){
            return third;
        }else{
            return max;
        }
    }
}