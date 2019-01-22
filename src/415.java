class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        String res="";
        while(i>=0&&j>=0){
            int c=carry+num1.charAt(i--)+num2.charAt(j--)-96;
            carry=c/10;
            res=c%10+res;
        }
        if(i>=0){
            while(i>=0){
                int c=carry+num1.charAt(i--)-48;
                carry=c/10;
                res=c%10+res;
            }
        }else if(j>=0){
            while(j>=0){
                int c=carry+num2.charAt(j--)-48;
                carry=c/10;
                res=c%10+res;
            }
        }
        if(carry==1){
            res=1+res;
        }
        return res;
    }
}