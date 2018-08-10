class Solution {
    public int findComplement(int num) {
        int mask=0x80000000;
		int t=0x7fffffff;
		for(int i=0;i<32;i++){
			if((num&mask)!=0){
				t<<=1;
				t++;
				return t^num;
			}
			mask>>>=1;
			t>>>=1;
		}
		return 0;
    }
}