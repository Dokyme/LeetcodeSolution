class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int distance=1;
        Set<String> reached=new HashSet();
        Set<String> unreached=new HashSet(wordList);
        reached.add(beginWord);
        if(!wordList.contains(endWord)){
            return 0;
        }
        while(!reached.contains(endWord)){
            Set<String> toAdd=new HashSet();
            for(String str:reached){
                for(int i=0;i<str.length();i++){
                    char[] chars=str.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        chars[i]=ch;
                        String word=new String(chars);
                        if(unreached.contains(word)){
                            unreached.remove(word);
                            toAdd.add(word);
                        }
                    }
                }
            }
            distance++;
            if(toAdd.size()==0){
                return 0;
            }
            reached=toAdd;
        }
        return distance;
    }
}