class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int ich = 0, jch = 0;
        char[] chs = s.toCharArray();
        while (i <= j) {
            while ((ich = isAlphabet(chs[i++])) == -1) {
                if (i >= s.length()) {
                    break;
                }
            }
            while ((jch = isAlphabet(chs[j--])) == -1) {
                if (j < 0) {
                    break;
                }
            }
            if (ich != jch) {
                return false;
            }
        }
        return true;
    }
    
    private int isAlphabet(char ch){
        if(ch>=65&&ch<=90){
            return ch+32;
        }else if(ch>=97&&ch<=122||(ch>=48&&ch<=57)){
            return ch;
        }else{
            return -1;
        }
    }
}