class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1||col==1){
            return true;
        }
        int current=0;
        for(int i=0;i<row;i++){
            current=matrix[i][0];
            for(int j=1;j<Math.min(row-i,col);j++){
                if(matrix[i+j][j]!=current){
                    return false;
                }
            }
        }
        for(int i=1;i<col;i++){
            current=matrix[0][i];
            for(int j=1;j<Math.min(col-i,row);j++){
                if(matrix[j][i+j]!=current){
                    return false;
                }
            }
        }
        return true;
    }
}