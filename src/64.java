class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int min=0;
                if(i==0&&j==0){
                    min=0;
                }else if(i==0){
                    min=grid[j-1][0];
                }else if(j==0){
                    min=grid[0][i-1];
                }else{
                    min=Math.min(grid[j-1][i],grid[j][i-1]);
                }
                grid[j][i]+=min;
            }
        }
        return grid[m-1][n-1];
    }
}