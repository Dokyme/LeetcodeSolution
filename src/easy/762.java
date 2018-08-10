class Solution {
    public int countPrimeSetBits(int L, int R) {
        int res=0;
        boolean[] isPrime=new boolean[]{false,false,true,true,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,true,false};
        for(int i=L;i<=R;i++){
            int count=Integer.bitCount(i);
            if(isPrime[count]){
                res++;
            }
        }
        return res;
    }
}