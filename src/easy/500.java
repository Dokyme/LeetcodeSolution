class Solution {
    public String[] findWords(String[] words) {
        String[] rows=new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        Set<Character>[] sets=new HashSet[3];
        for(int i=0;i<3;i++){
            sets[i]=new HashSet();
            for(char ch:rows[i].toCharArray()){
                sets[i].add(ch);
            }
        }
        String[] res=new String[words.length];
        int size=0;
        Set<Character> set=null;
        boolean next=false;
        for(String word:words){
            set=null;
            next=false;
            for(char ch:word.toLowerCase().toCharArray()){
                
                for(Set<Character> si:sets){
                    if(set==null&&si.contains(ch)){
                        set=si;
                    }else if(set!=null&&!set.contains(ch)){
                        next=true;
                        break;
                    }
                }
                if(next){
                    break;
                }
            }
            if(!next){
                res[size++]=word;
            }
        }
        return Arrays.copyOf(res,size);
    }
}