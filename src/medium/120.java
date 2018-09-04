class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        if(rows==0){
            return 0;
        }
        for(int i=rows-1;i>0;i--){
            int downCols=triangle.get(i).size();
            for(int j=0;j<downCols-1;j++){
                triangle.get(i-1).set(j,Math.min(triangle.get(i).get(j),triangle.get(i).get(j+1))+triangle.get(i-1).get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}