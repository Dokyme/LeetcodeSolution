class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int m=A.length,n=A[0].length;
        for(int j=0;j<m;j++){
            for(int i=0;i<n/2;i++){
                int temp=A[j][i];
                A[j][i]=A[j][n-1-i];
                A[j][n-1-i]=temp;
                A[j][i]^=1;
                A[j][n-1-i]^=1;
            }
            if(n%2==1){
                A[j][n/2]^=1;
            }
        }
        
        
        return A;
    }
}