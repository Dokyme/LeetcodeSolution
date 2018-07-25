class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set=new HashSet();
        String[] alphebat=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(alphebat[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}