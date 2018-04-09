class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int state=0;
        int start=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            switch(state){
                case 0:
                    if(nums[i]==1){
                        start=i;
                        state=1;
                    }
                    break;
                case 1:
                    if(nums[i]==0){
                        max=Math.max(max,i-start);
                        state=0;
                    }
                    break;
            }
        }
        if(state==1)
            max=Math.max(max,nums.length-start);
        return max;
    }
}