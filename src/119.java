class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>(rowIndex+2);
        result.add(1);
        for(int i=0;i<rowIndex;i++){
            for(int j=i;j>0;j--){
                result.set(j,result.get(j-1)+result.get(j));
            }
            result.add(1);
        }
        return result;
    }
}