class Solution {
    public int countSegments(String s) {
        boolean seg=false;
        int count=0;
        for(char ch:s.toCharArray()){
            if(!seg&&ch!=' '){
                seg=true;
                count++;
            }else if(seg&&ch==' '){
                seg=false;
            }
        }
        return count;
    }
}