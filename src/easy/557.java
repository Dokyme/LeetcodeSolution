class Solution {
    public String reverseWords(String s) {
        char[] chs=s.toCharArray();
        int left=0,right=0;
        while(right<chs.length){
            if(chs[right]==' '){
                reverse(chs,left,right-1);
                left=right+1;
            }
            right++;
        }
        if(right==chs.length){
            reverse(chs,left,right-1);
        }
        return String.valueOf(chs);
    }
    
    private void reverse(char[] chs,int start,int end){
        while(start<=end){
            char temp=chs[start];
            chs[start]=chs[end];
            chs[end]=temp;
            end--;
            start++;
        }
    }
}