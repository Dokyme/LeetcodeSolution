class Solution {
    public boolean isHappy(int n) {
        Set<Integer> loop=new HashSet();
        int digit=0,sum=0;
        while(!loop.contains(n)){
            loop.add(n);
            sum=0;
            while(n>0){
                digit=n%10;
                n/=10;
                sum+=digit*digit;
            }
            if(sum==1){
                return true;
            }
            n=sum;
        }
        return false;
    }
}