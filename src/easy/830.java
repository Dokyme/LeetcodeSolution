class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result=new ArrayList();
        char[] chs=S.toCharArray();
        int last=0;
        int i;
        for(i=1;i<chs.length;i++){
            if(chs[i]!=chs[last]){
                if(i-last>=3){
                    List<Integer> tup=new ArrayList();
                    tup.add(last);
                    tup.add(i-1);
                    result.add(tup);
                }
                last=i;
            }
        }
        if(i-last>=3){
            List<Integer> tup=new ArrayList();
            tup.add(last);
            tup.add(i-1);
            result.add(tup);
        }
        return result;
    }
}