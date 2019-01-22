class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int res=10,uniqueDigitsOfLength=9;
        int t=9;
        if(n==0){
            return 1;
        }
        n--;
        while(n-->0 && t>0){
            t*=uniqueDigitsOfLength--;
            res+=t;
        }
        return res;
    }
}