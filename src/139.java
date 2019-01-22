class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] contains=new boolean[s.length()+1];
        contains[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(contains[j]&&wordDict.contains(s.substring(j,i))){
                    contains[i]=true;
                    break;
                }
            }
        }
        return contains[s.length()];
    }
}