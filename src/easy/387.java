class Solution {
    public int firstUniqChar(String s) {
        if(s.equals(""))
            return -1;
        int[] index=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(index[ch]>0){
                //if it has appeared before
                index[ch]=-index[ch];
            }else if(index[ch]==0){
                index[ch]=i+1;
            }
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<index.length;i++){
            if(index[i]>0){
                result=Math.min(result,index[i]);
            }
        }
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        return result-1;
    }
}