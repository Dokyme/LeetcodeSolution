class Solution {
    public int peakIndexInMountainArray(int[] ints) {
        for(int i=1;i<ints.length;i++){
            if(ints[i]<ints[i-1]){
                return i-1;
            }
        }
        return 0;
    }
}