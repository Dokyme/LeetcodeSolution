class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int[] window=new int[256];
        char[] chs=s.toCharArray();
        for(int i=0;i<window.length;i++){
            window[i]=-1;
        }
        int max=-1;
        int left=0;
        for(int i=0;i<chs.length;i++){
            if(window[chs[i]]!=-1){
                left=Math.max(left,window[chs[i]]+1);
            }
            window[chs[i]]=i;
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}