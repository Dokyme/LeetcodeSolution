class Solution {
    public int nthUglyNumber(int n) {
        int factor2=2,factor3=3,factor5=5;
        int index2=0,index3=0,index5=0;
        int[] ugly=new int[n];
        ugly[0]=1;
        for(int i=1;i<n;i++){
            int min=Math.min(Math.min(factor2,factor3),factor5);
            ugly[i]=min;
            if(factor2==min){
                factor2=ugly[++index2]*2;
            }
            if(factor3==min){
                factor3=ugly[++index3]*3;
            }
            if(factor5==min){
                factor5=ugly[++index5]*5;
            }
        }
        return ugly[n-1];
    }
}