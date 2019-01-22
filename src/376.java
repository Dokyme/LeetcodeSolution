class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int[] asc=new int[n];
        int[] desc=new int[n];
        int globalMax=1;
        asc[0]=desc[0]=1;
        for(int i=1;i<n;i++){
            int maxAsc=Integer.MIN_VALUE;
            int maxDesc=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    maxAsc=Math.max(maxAsc,desc[j]+1);
                }else if(nums[j]>nums[i]){
                    maxDesc=Math.max(maxDesc,asc[j]+1);
                }
            }
            asc[i]=maxAsc;
            desc[i]=maxDesc;
            globalMax=Math.max(Math.max(maxAsc,maxDesc),globalMax);
        }
        return globalMax;
    }
}