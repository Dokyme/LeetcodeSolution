class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList();
        for(int i=left;i<=right;i++){
            String stri=i+"";
            boolean f=true;
            for(Character ch:stri.toCharArray()){
                if(Character.getNumericValue(ch)==0){
                    f=false;
                    break;
                }
                if(i%Character.getNumericValue(ch)!=0){
                    f=false;
                    break;
                }
            }
            if(f){
                res.add(i);
            }
        }
        return res;
    }
}