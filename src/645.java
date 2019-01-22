class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] pre=new int[10001];
        pre[0]=1;
        int[] res=new int[2];
        for(int num:nums){
            if(pre[num]==1){
                res[0]=num;
            }else{
                pre[num]=1;
            }
        }
        for(int i=1;i<10000;i++){
            if(pre[i]==0){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}