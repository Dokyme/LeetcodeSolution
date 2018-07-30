class Solution {
    public int[][] transpose(int[][] A) {
        int m=A.length,n=A[0].length;
        int[][] trans=new int[n][];
        for(int j=0;j<n;j++){
            trans[j]=new int[m];
            for(int i=0;i<m;i++){
                trans[j][i]=A[i][j];
            }
        }
        return trans;
    }
}