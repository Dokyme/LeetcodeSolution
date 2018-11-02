class Solution {
    public void solve(char[][] board) {
        if(board.length==0){
            return;
        }
        for(int i=0;i<board.length;i++){
            dfs(board,i,0);
            dfs(board,i,board[0].length-1);
        }
        for(int i=1;i<board[0].length-1;i++){
            dfs(board,0,i);
            dfs(board,board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='V'){
                    board[i][j]='O';
                }
            }
        }
    }
    
    private void dfs(char[][] board,int x,int y){
        if(x<0||x>=board.length||y<0||y>=board[0].length){
            return;
        }
        if(board[x][y]=='O'){
            board[x][y]='V';
            dfs(board,x+1,y);
            dfs(board,x-1,y);
            dfs(board,x,y+1);
            dfs(board,x,y-1);
        }
    }
}