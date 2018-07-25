class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        char[] cha=A.toCharArray();
        char[] chb=B.toCharArray();
        int j=0;
        int diff=0;
        int[] diffPos=new int[A.length()];
        for(int i=0;i<A.length();i++,j++){
            if(cha[i]!=chb[j]){
                diffPos[diff++]=i;
            }
        }
        if(diff==0){
            Set<Character> set=new HashSet();
            for(char ch:cha){
                if(set.contains(ch)){
                    return true;
                }
                set.add(ch);
            }
            return false;
        }
        if(diff!=2){
            return false;
        }
        char t=cha[diffPos[0]];
        cha[diffPos[0]]=cha[diffPos[1]];
        cha[diffPos[1]]=t;
        return new String(cha).equals(B);
    }
}