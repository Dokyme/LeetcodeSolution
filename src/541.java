class Solution {
    public String reverseStr(String s, int k) {
        
        char[] chs=s.toCharArray();
        int n=chs.length;
        for(int i=0;i<n;i+=2*k){
            if(n-i<k){
                reverse(chs,i,n-1);
                break;
            }else if(n-i<2*k){
                reverse(chs,i,i+k-1);
                break;
            }else{
                reverse(chs,i,i+k-1);
            }
        }
        return String.valueOf(chs);
    }
    
    private void reverse(char[] chs,int start,int end){
        int i=start,j=end;
        while(i<=j){
            char temp=chs[i];
            chs[i]=chs[j];
            chs[j]=temp;
            i++;
            j--;
        }
    }
}