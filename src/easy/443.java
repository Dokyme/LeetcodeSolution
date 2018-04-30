class Solution {
    public int compress(char[] chars) {
        if(chars.length==0){
            return 0;
        }
        int cursor=0;//cursor指向字母位
        int counter=1;
        char ch=chars[0];
        for(int i=1;i<chars.length;i++){
            if(ch==chars[i]){
                counter++;
            }else{
                chars[cursor++]=ch;
                if(counter!=1){
                    cursor=putNumber(chars,cursor,counter);
                }
                counter=1;
                ch=chars[i];
            }
        }
        chars[cursor++]=ch;
        if(counter!=1){
            cursor=putNumber(chars,cursor,counter);
        }
        return cursor;
    }
    
    private int putNumber(char[] chars,int offset,int value){
        int digits=0;
        int b=value;
        while(b>0){
            digits++;
            b/=10;
        }
        int res=1;
        for(int i=0;i<digits-1;i++){
            res*=10;
        }
        for(int i=0;i<digits;i++){
            chars[offset+i]=(char)('0'+value/res);
            value%=10;
            res/=10;
        }
        return offset+digits;
    }
}