class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        if(numRows==0){
            return tri;
        }
        List<Integer> first=new ArrayList<>();
        first.add(1);
        tri.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>(i+2);
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(tri.get(i-1).get(j)+tri.get(i-1).get(j+1));
            }
            row.add(1);
            tri.add(row);
        }
        return tri;
    }
}