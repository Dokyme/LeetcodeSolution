class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=-1;
        while(n>0){
            if(n%2!=prev){
                prev=n%2;
                n>>=1;
            }else{
                return false;
            }
        }
        return true;
    }
}