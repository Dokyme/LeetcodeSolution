class Solution {
    public boolean checkRecord(String s) {
        char[] chs=s.toCharArray();
        int a=0;
        for(int i=0;i<chs.length;i++){
            if(chs[i]=='A'){
                a++;
            }else if(i>1&&chs[i-2]=='L'&&chs[i-1]=='L'&&chs[i]=='L'){
                return false;
            }
        }
        return a<=1;
    }
}