class Solution {
    public int arrangeCoins(int n) {
        int col=1;
        while(n-col>=0){
            n-=col++;
        }
        return col-1;
    }
}