class Solution {
    public int findSubstringInWraproundString(String p) {
        int res=0;
        int[] maxStrEndsWith=new int[26];
        int max=0;
        char[] chs=p.toCharArray();
        for(int i=0;i<p.length();i++){
            if(i>0&&(chs[i]-chs[i-1]==1||chs[i-1]-chs[i]==25)){
                max++;
            }else{
                max=1;
            }
            int ch=chs[i]-'a';
            maxStrEndsWith[ch]=Math.max(maxStrEndsWith[ch],max);
        }
        for(int i:maxStrEndsWith){
            res+=i;
        }
        return res;
    }
}