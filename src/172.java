class Solution {
    public int titleToNumber(String s) {
        int res=0;
        char[] chs=s.toCharArray();
        for(int i=0;i<chs.length;i++){
            res=res*26+(int)chs[i]-64;
        }
        return res;
    }
}