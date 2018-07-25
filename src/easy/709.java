class Solution {
    public String toLowerCase(String str) {
        char lo='A',hi='Z';
        char[] chs=str.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(chs[i]>=lo&&chs[i]<=hi){
                chs[i]+=32;
            }
        }
        return new String(chs);
    }
}