class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!checkRow(board,i)){
                return false;
            }
            if(!checkColumn(board,i)){
                return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!checkGrid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean checkGrid(char[][] board,int x,int y){
        boolean[] num=new boolean[10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char ch=board[x+i][y+j];
                if(ch=='.'){
                    continue;
                }
                int n=Integer.valueOf(""+ch);
                if(num[n]){
                    return false;
                }
                num[n]=true;
            }
        }
        return true;
    }
    
    private boolean checkRow(char[][] board,int index){
        boolean[] num=new boolean[10];
        for(int i=0;i<board[index].length;i++){
            char ch=board[index][i];
            if(ch=='.'){
                continue;
            }
            int n=Integer.valueOf(""+ch);
            if(num[n]){
                return false;
            }
            num[n]=true;
        }
        return true;
    }
    
    private boolean checkColumn(char[][] board,int index){
        boolean[] num=new boolean[10];
        for(int i=0;i<board.length;i++){
            char ch=board[i][index];
            if(ch=='.'){
                continue;
            }
            int n=Integer.valueOf(""+ch);
            if(num[n]){
                return false;
            }
            num[n]=true;
        }
        return true;
    }
}