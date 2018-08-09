class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res=new ArrayList();
       for(int i=0;i<=num;i++){
           List<Integer> hours=decOfBits(i,12);
           List<Integer> minutes=decOfBits(num-i,60);
           for(int hour:hours){
               if(hour>11)continue;
               for(int minute:minutes){
                   if(minute>59)continue;
                   res.add(String.format("%d:%02d",hour,minute));
               }
           }
       }
        return res;
    }
    
    public List<Integer> decOfBits(int num,int max){
        List<Integer> res=new ArrayList();
        for(int i=0;i<=max;i++){
            if(getBitOne(i)==num){
                res.add(i);
            }
        }
        return res;
    }
    
    public int getBitOne(int num){
        int n=0;
        while(num>0){
            n+=(num&1);
            num>>=1;
        }
        return n;
    }
}