class Solution {
    public int countBinarySubstrings(String s) {
        int[] a=new int[s.length()];
        int ai=0;
        char[] chs=s.toCharArray();
        int last=0;
        for(int i=1;i<chs.length;i++){
            if(chs[i]!=chs[last]){
                a[ai++]=i-last;
                last=i;
            }
        }
        a[ai++]=chs.length-last;
        int total=0;
        for(int i=1;i<ai;i++){
            total+=Math.min(a[i],a[i-1]);
        }
        return total;
    }
}