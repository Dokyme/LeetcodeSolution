class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] t=new int[m+1][n+1];
        for(String str:strs){
            int[] c=count(str);
            for(int i=m;i>=c[0];i--){
                for(int j=n;j>=c[1];j--){
                    t[i][j]=Math.max(t[i][j],t[i-c[0]][j-c[1]]+1);
                }
            }
        }
        return t[m][n];
    }
    
    private int[] count(String str){
        int[] r=new int[]{0,0};
        for(char ch:str.toCharArray()){
            if(ch=='0'){
                r[0]++;
            }else{
                r[1]++;
            }
        }
        return r;
    }
}