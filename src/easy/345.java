class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1, N = s.length();
        char[] chs = s.toCharArray();
        char[] res = new char[chs.length];
        while (i < s.length() && j >= 0) {
            while (i < N && !isVowels(chs[i])) {
                res[i] = chs[i++];
            }
            while (j >= 0 && !isVowels(chs[j])) {
                j--;
            }
            if (i >= s.length() || j < 0) {
                break;
            }
            res[i++] = chs[j--];
        }
        while (i < s.length()) {
            res[i] = chs[i++];
        }
        return String.valueOf(res);
    }
    
    private boolean isVowels(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}