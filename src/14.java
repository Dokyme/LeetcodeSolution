class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int minLength=Integer.MAX_VALUE;
        for(String str:strs){
            minLength=Math.min(minLength,str.length());
        }
        for(int i=0;i<minLength;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}