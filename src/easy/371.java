class Solution {
    public int getSum(int a, int b) {
        int res=0;
        int carry=0;
        int mask=1;
        for(int i=0;i<32;i++){
            int t=(a&mask)+(b&mask)+carry;
            carry=t&(mask<<1);
            res+=(t&mask);
            mask<<=1;
        }
        return res;
    }
}