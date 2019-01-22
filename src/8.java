class Solution {
    public int myAtoi(String str) {
        int pos=0;
        boolean neg=false;
        char[] chs=str.toCharArray();
        for(;pos<chs.length;pos++){
            if(chs[pos]=='+'){
                neg=false;
                pos++;
                break;
            }else if(chs[pos]=='-'){
                neg=true;
                pos++;
                break;
            }else if(chs[pos]<='9'&&chs[pos]>='0'){
                break;
            }else if(chs[pos]==' '){
                continue;
            }else{
                return 0;
            }
        }
        int res=0;
        for(;pos<chs.length;pos++){
            if(chs[pos]<'0'||chs[pos]>'9'){
                break;
            }
            int n=Integer.valueOf(""+chs[pos]);
            if((neg&&res>-(Integer.MIN_VALUE/10))||((!neg&&res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10&&n>Integer.MAX_VALUE%10))){
                return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res*=10;
            res+=n;
        }
        return neg?-res:res;
    }
}