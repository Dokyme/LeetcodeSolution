class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        if(row==0){
            return;
        }
        int col=matrix[0].length;
        for(int i=0;i<row/2;i++){
            int[] temp=matrix[i];
            matrix[i]=matrix[row-1-i];
            matrix[row-1-i]=temp;
        }
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}