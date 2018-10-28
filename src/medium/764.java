class Solution {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] mat=new int[N][N];
        for(int[] row:mat){
            Arrays.fill(row,1);
        }
        for(int[] mine:mines){
            mat[mine[0]][mine[1]]=0;
        }
        int max=0;
        //中心辐射延伸
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int dis=0;
                while(i-dis>=0&&i+dis<N&&j-dis>=0&&j+dis<N
                      &&mat[i-dis][j]==1&&mat[i+dis][j]==1&&mat[i][j-dis]==1&&mat[i][j+dis]==1){
                    dis++;
                }
                max=Math.max(dis,max);
            }
        }
        return max;
    }
}

class Solution {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] mat=new int[N][N];
        for(int[] row:mat){
            Arrays.fill(row,1);
        }
        for(int[] mine:mines){
            mat[mine[0]][mine[1]]=0;
        }
        int max=0;
        int[][] left=new int[N][N];
        int[][] right=new int[N][N];
        int[][] buttom=new int[N][N];
        int[][] up=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(mat[i][j]==1){
                    left[i][j]=j>0?left[i][j-1]+1:1;
                    up[i][j]=i>0?up[i-1][j]+1:1;
                }   
            }
        }
        for(int i=N-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                if(mat[i][j]==1){
                    buttom[i][j]=i<N-1?buttom[i+1][j]+1:1;
                    right[i][j]=j<N-1?right[i][j+1]+1:1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans=Math.max(ans,Math.min(Math.min(up[i][j],buttom[i][j]),Math.min(left[i][j],right[i][j])));
            }
        }
        return ans;
    }
}