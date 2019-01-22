class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int state=0;
        int end=s.length();
        for(int i=s.length()-1;i>=0;i--){
            switch(state){
                case 0:
                    if(s.charAt(i)!=' '){
                        state=1;
                        end=i;
                    }
                    break;
                case 1:
                    if(s.charAt(i)==' '){
                        return end-i;
                    }
                    break;
            }
        }
        if(state==1){
            return end+1;
        }
        return 0;
    }
}