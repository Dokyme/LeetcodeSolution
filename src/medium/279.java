class Solution {
    public int numSquares(int n) {
        int[] numSquares=new int[n+1];
        numSquares[0]=0;
        for(int i=1;i<=n;i++){
            int minNumSquares=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                minNumSquares=Math.min(numSquares[i-j*j]+1,minNumSquares);
            }
            numSquares[i]=minNumSquares;
        }
        return numSquares[n];
    }
}