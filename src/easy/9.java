class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0||x%10==0){
            return false;
        }
        int half=0;
        while(x>half){
            half=half*10+x%10;
            x/=10;
        }
        //12 21
        //322 3->32 32-> 3 232
        //121->12 1->1 12
        //10->1 0->0 1
        return x==half||x==half/10;
    }
}