class Solution {
    public boolean judgeCircle(String moves) {
        int cu=0,cr=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                cu++;
            }else if(ch=='D'){
                cu--;
            }else if(ch=='L'){
                cr--;
            }else{
                cr++;
            }
        }
        return cu==0&&cr==0;
    }
}