class Solution {
    int[][] dirs={{0,-1},{0,1},{1,0},{-1,0}};
    
    public int findPaths(int m, int n, int N, int i, int j) {
        long[][][] route=new long[m][n][N+1];
        for(int a=0;a<m;a++){
            for(int b=0;b<n;b++){
                for(int k=0;k<N+1;k++){
                    route[a][b][k]=-1;
                }
            }
        }
        return (int)(dfs(route,m,n,N,i,j) % 1000000007);
    }
    
    private long dfs(long[][][] route,int m,int n,int N,int i,int j){
        if(i<0||i>=m||j<0||j>=n){
            return 1;
        }
        if(N<=0){
            return 0;
        }
        if(route[i][j][N]!=-1){
            return route[i][j][N];
        }
        route[i][j][N]=0;
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            route[i][j][N]=(route[i][j][N]+(dfs(route,m,n,N-1,x,y)%1000000007))%1000000007;
        }
        return route[i][j][N]%1000000007;
    }
}