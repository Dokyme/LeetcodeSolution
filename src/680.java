class Solution {
    public boolean validPalindrome(String s) {
        return valid(s.toCharArray(),0,s.length()-1,false);
    }
    
    private boolean valid(char[] chs,int i,int j,boolean flag){
        if(i>=j){
            return true;
        }
        if(chs[i]!=chs[j]){
            if(flag){
                return false;
            }
            return valid(chs,i+1,j,true)||valid(chs,i,j-1,true);
        }else{
            return valid(chs,i+1,j-1,flag);
        }
    }
}