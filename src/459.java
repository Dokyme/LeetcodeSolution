class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size=1,index=0;
        char[] chs=s.toCharArray();
        int i=0;
        while(i<chs.length&&i<=chs.length-size){
            index=0;
            while(index<size&&chs[index]==chs[i]){
                index++;
                i++;
            }
            if(index<size){
                i=++size;
            }
        }
        return i==chs.length&&size<=s.length()/2;
    }
}