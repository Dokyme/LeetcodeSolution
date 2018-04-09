class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length;
        int col=nums[0].length;
        if(r*c>row*col){
            return nums;
        }
        int[][] result=new int[r][c];
        for(int i=0;i<result.length;i++){
            result[i]=new int[c];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[(i*col+j)/c][(i*col+j)%c]=nums[i][j];
            }
        }
        return result;
    }
}