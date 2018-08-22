class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] array=new int[m];
        if(grid[0][0]==0){
            array[0]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    if(grid[0][i]==1){
                        array[0]=0;
                    }
                    continue;
                }
                if(i==0){
                    array[j]=array[j-1];
                    if(grid[j][0]==1){
                        array[j]=0;
                    }
                    continue;
                }
                if(grid[j][i]==1){
                    array[j]=0;
                }else{
                    array[j]+=array[j-1];
                }
            }
        }
        return array[m-1];
    }
}