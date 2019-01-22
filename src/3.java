class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet();
        int i=0,j=0;
        int max=0;
        char[] chs=s.toCharArray();
        for(j=0;j<chs.length;){
            if(!set.contains(chs[j])){
                set.add(chs[j++]);
                max=Math.max(max,set.size());
            }else{
                set.remove(chs[i++]);
            }
        }
        return max;
    }
}