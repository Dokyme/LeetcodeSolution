class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo=0,hi=letters.length-1;
        char ceil='!';
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(letters[mid]>target){
                ceil=letters[mid];
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        if(ceil=='!'){
            return letters[0];
        }
        return ceil;
    }
}