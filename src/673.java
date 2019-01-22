class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=0,maxLen=0;
        int[] len=new int[nums.length];
        int[] cnt=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            len[i]=cnt[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(len[i]==len[j]+1){
                        cnt[i]+=cnt[j];
                    }
                    if(len[i]<len[j]+1){
                        len[i]=len[j]+1;
                        cnt[i]=cnt[j];
                    }
                }
            }
            if(maxLen==len[i]){
                res+=cnt[i];
            }
            if(maxLen<len[i]){
                maxLen=len[i];
                res=cnt[i];
            }
        }
        return res;
    }
}