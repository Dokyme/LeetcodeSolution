class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb=new StringBuilder();
        char[] chs=S.toCharArray();
        int last=-1;
        int wordIndex=1;
        for(int i=0;i<chs.length;i++){
            if(chs[i]==' '){
                String str=S.substring(last+1,i);
                last=i;
                sb=sb.append(goat(str,wordIndex++)).append(" ");
            }
        }
        String str=S.substring(last+1,chs.length);
        sb=sb.append(goat(str,wordIndex++));
        return sb.toString();
    }
    
    private String goat(String src,int index){
        String low=src.toLowerCase();
        char[] lowch=low.toCharArray();
        if(lowch[0]=='a'||lowch[0]=='e'||lowch[0]=='i'||lowch[0]=='o'||lowch[0]=='u'){
            src+="ma";
        }else{
            src=src.substring(1,lowch.length)+src.toCharArray()[0]+"ma";
        }
        for(int i=0;i<index;i++){
            src+="a";
        }
        return src;
    }
}