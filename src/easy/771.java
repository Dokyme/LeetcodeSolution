class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] jews=new boolean[256];
        for(char ch:J.toCharArray()){
            jews[ch]=true;
        }
        int count=0;
        for(char ch:S.toCharArray()){
            if(jews[ch]){
                count++;
            }
        }
        return count;
    }
}