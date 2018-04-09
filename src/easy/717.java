class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length-1){
            //if bits[i]==1,i+=2
            //if bits[i]==0,i+=1
            //if bits[-2]==0,i+=1,then i==-1
            //if bits[-2]==1,i+=2,then i==length
            i+=bits[i]+1;
        }
        return i==bits.length-1;
    }
}