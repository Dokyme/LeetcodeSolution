class Solution {
    public int hammingDistance(int x, int y) {
        int ham=0;
        int xor=x^y;
        for(int i=0;i<32;i++){
            ham+=xor&1;
            xor>>=1;
        }
        return ham;
    }
}