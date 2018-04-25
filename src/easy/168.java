class Solution {
    public String convertToTitle(int n) {
        String col="";
        while(n>0){
            col=(char)((n-1)%26+65)+col;
            n=(n-1)/26;
        }
        return col;
    }
}