class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mmin=m;
        int nmin=n;
        for(int[] op:ops){
            mmin=Math.min(op[0],mmin);
            nmin=Math.min(op[1],nmin);
        }
        return mmin*nmin;
    }
}