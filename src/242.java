class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] scount=new int[256];
        for(char c:s.toCharArray()){
            scount[c]++;
        }
        for(char c:t.toCharArray()){
            scount[c]--;
        }
        for(int i=0;i<scount.length;i++){
            if(scount[i]!=0){
                return false;
            }
        }
        return true;
    }
}