class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] result=new int[M.length][M[0].length];
        int row=M.length;
        int col=M[0].length;
        for(int i=0;i<M.length;i++){
            result[i]=new int[col];
        }
        int sum=0;
        int count=9;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                count=9;
                sum=0;
                for(int rd=i-1;rd<=i+1;rd++){
                    for(int cd=j-1;cd<=j+1;cd++){
                        if(rd<0||rd>=row||cd<0||cd>=col){
                            count--;
                        }else{
                            sum+=M[rd][cd];
                        }
                    }
                }
                result[i][j]=sum/count;
            }
        }
        return result;
    }
}