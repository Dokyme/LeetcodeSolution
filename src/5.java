class Solution {
    
    private int maxLength;
    private int start;
    
    public String longestPalindrome(String s) {
        int length=s.length();
        char[] chs=s.toCharArray();
        for(int i=0;i<chs.length;i++){
            int j=0;
            while(i-j>=0&&i+j<length){
                //check odd "abcba"
                if(chs[i-j]!=chs[i+j]){
                    break;
                }
                j++;
            }
            if(2*j-1>maxLength){
                maxLength=2*j-1;
                start=i-j+1;
            }
            j=0;
            while(i-j>=0&&i+j+1<length){
                //check even "abccba"
                if(chs[i-j]!=chs[i+j+1]){
                    break;
                }
                j++;
            }
            if(2*j>maxLength){
                maxLength=2*j;
                start=i-j+1;
            }
        }
        return s.substring(start,start+maxLength);
    }
}