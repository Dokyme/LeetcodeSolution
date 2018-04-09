class Solution {
    private boolean[][] seen;
    
    public int maxAreaOfIsland(int[][] grid) {
        seen=new boolean[grid.length][grid[0].length];
        for(int i=0;i<seen.length;i++){
            for(int j=0;j<seen[0].length;j++){
                seen[i][j]=false;
            }
        }
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!seen[i][j]&&grid[i][j]==1)
                max=Math.max(max,area(grid,i,j));
            }
        }
        return max;
    }
    
    public int area(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||seen[i][j]||grid[i][j]==0){
            return 0;
        }
        seen[i][j]=true;
        return area(grid,i-1,j)+area(grid,i+1,j)+area(grid,i,j-1)+area(grid,i,j+1)+1;
    }
}