class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i*i<=c;i++){
            int b=c-(int)(i*i);
            if(search(0,b,b)){
                return true;
            }
        }
        return false;
    }
    
    public boolean search(long s,long e,int n){
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid>n){
                e=mid-1;
            }else if(mid*mid<n){
                s=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}