class Solution {
    public static int findNthDigit(int n) {
        int length=1;
        long count=9;
        int start=1;
        while(n>count*length){
            n-=count*length;
            length++;
            count*=10;
            start*=10;//1...10...100...1000
        }
        start+=(n-1)/length;
        String numeric=start+"";
        return Integer.valueOf(""+numeric.charAt((n-1)%length));
    }
}