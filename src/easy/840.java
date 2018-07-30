class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int[][][] copy=new int[grid.length][][];
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            copy[i]=new int[n][];
            for(int j=0;j<n;j++){
                copy[i][j]=new int[4];
                if(j>1&&i<m-2){
                    copy[i][j][3]=grid[i][j]+grid[i+1][j-1]+grid[i+2][j-2];
                }
                if(j<n-2){
                    copy[i][j][0]=grid[i][j]+grid[i][j+1]+grid[i][j+2];
                }
                if(i<m-2){
                    copy[i][j][1]=grid[i][j]+grid[i+1][j]+grid[i+2][j];
                }
                if(i<m-2&&j<n-2){
                    copy[i][j][2]=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                }
            }
        }
        int res=0;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                res+=isMagic(copy,grid,i,j);
            }
        }
        return res;
    }
    
    private int isMagic(int[][][] copy,int[][] grid,int i,int j){
        for(int m=i;m<i+3;m++){
            for(int n=j;n<j+3;n++){
                if(grid[m][n]<1||grid[m][n]>9){
                    return 0;
                }
            }
        }
        int acc=copy[i][j][0];
        return acc==copy[i+1][j][0]&&acc==copy[i+2][j][0]&&acc==copy[i][j][1]&&acc==copy[i][j+1][1]&&acc==copy[i][j+2][1]
            &&acc==copy[i][j][2]&&acc==copy[i][j+2][3]?1:0;
    }
}