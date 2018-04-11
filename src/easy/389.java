class Solution {
    public char findTheDifference(String s, String t) {
        int[] counts=new int[26];
        for(char ch:s.toCharArray()){
            counts[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            counts[ch-'a']--;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                return (char)(i+'a');
            }
        }
        return 'a';
    }
}