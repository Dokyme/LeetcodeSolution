class Solution {
    public int maximalSquare(char[][] matrix) {
        int row=matrix.length;
        if(row==0){
            return 0;
        }
        int col=matrix[0].length;
        int maxLen=0;
        int[][] m=new int[row][];
        for(int i=0;i<row;i++){
            m[i]=new int[col];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0){
                    m[i][j]=matrix[i][j]-'0';
                    maxLen=Math.max(maxLen,m[i][j]);
                }else{
                    if(matrix[i][j]=='1'){
                        m[i][j]=Math.min(Math.min(m[i-1][j],m[i][j-1]),m[i-1][j-1])+1;
                        maxLen=Math.max(maxLen,m[i][j]);
                    }
                }
                
            }
        }
        return maxLen*maxLen;
    }
}