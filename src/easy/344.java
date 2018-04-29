class Solution {
    public String reverseString(String s) {
        char[] ch=s.toCharArray();
        char[] res=new char[ch.length];
        for(int i=s.length()-1;i>=0;i--){
            res[s.length()-1-i]+=ch[i];
        }
        return String.valueOf(res);
    }
}