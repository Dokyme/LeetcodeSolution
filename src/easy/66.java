class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for(i=digits.length-1;i>=0;i--){
            if(++digits[i]==10){
                digits[i]=0;
            }else{
                return digits;
            }
        }
        if(i==-1){
            int[] result=new int[digits.length+1];
            result[0]=1;
            return result;
        }
        return digits;
    }
}