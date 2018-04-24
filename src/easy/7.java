class Solution {
    public int reverse(int x) {
        int MAX=Integer.MAX_VALUE/10;
        boolean negative=false;
        if(x<0){
            negative=true;
            x=-x;
        }
        int[] digits=new int[31];
        int length=0;
        while(x>0){
            digits[length++]=x%10;
            x=x/10;
        }
        int result=0;
        for(int i=0;i<length;i++){
            if(result>MAX){
                return 0;
            }
            result=result*10+digits[i];
        }
        if(negative){
            result=-result;
        }
        return result;
    }
}