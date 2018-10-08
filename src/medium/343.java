class Solution {
    /**
    2:1*1=1
    3:2*1=2
    4:2*2=4
    5:3*2=6
    6:3*3=9,2*2*2=8
    7:4*3=12,3*2*2=12
    8:3*3*2=18
    9:3*3*3=27
    10:4*3*3=36
    **/
    public int integerBreak(int n) {
        if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }else{
            int res=1;
            while(n>4){
                n-=3;
                res*=3;
            }
            res*=n;
            return res;
        }
    }
}