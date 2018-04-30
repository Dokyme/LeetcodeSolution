class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chs=word.toCharArray();
        int i=0;
        int state=0;
        while(i<chs.length){
            char ch=chs[i++];
            if(ch==' '){
                state=0;
                continue;
            }
            switch(state){
                case 0://new word
                    if(isCapital(ch)){
                        state=1;//First word captical
                    }else{
                        state=2;//all non-capitcal in this word
                    }
                    break;
                case 1://First word captical
                    if(isCapital(ch)){
                        state=3;//all captical in this word
                    }else{
                        state=4;//only first word captical
                    }
                    break;
                case 2://all non-capitcal in this word
                    if(isCapital(ch)){
                        return false;
                    }
                    break;
                case 3://all captical in this word
                    if(!isCapital(ch)){
                        return false;
                    }
                    break;
                case 4://only first word captical
                    if(isCapital(ch)){
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
    
    private boolean isCapital(char ch){
        if(ch>=65&&ch<=90){
            return true;
        }
        return false;
    }
}