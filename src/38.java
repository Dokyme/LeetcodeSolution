class Solution {
    public String countAndSay(int n) {
        String current="1";
        StringBuilder builder=new StringBuilder();
        char last;
        int count;
        for(int i=1;i<n;i++){
            builder=new StringBuilder();
            last=current.charAt(0);
            count=1;
            for(int j=1;j<current.length();j++){
                if(current.charAt(j)==last){
                    count++;
                }else{
                    builder.append(""+count+last);
                    last=current.charAt(j);
                    count=1;
                }
            }
            builder.append(""+count+last);
            current=builder.toString();
        }
        return current;
    }
}