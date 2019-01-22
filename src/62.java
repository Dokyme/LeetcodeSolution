class Solution {
    public int uniquePaths(int m, int n) {
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                p[j]+=p[j-1];
            }
        }
        return p[n-1];
    }
}