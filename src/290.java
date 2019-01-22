class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map=new HashMap();
        Set<String> mapped=new HashSet();
        String[] tokens=str.split(" ");
        if(pattern.length()!=tokens.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)&&!map.get(ch).equals(tokens[i])){
                return false;
            }else if(!map.containsKey(ch)&&mapped.contains(tokens[i])){
                return false;
            }else if(!map.containsKey(ch)){
                mapped.add(tokens[i]);
                map.put(ch,tokens[i]);
            }else{
                continue;
            }
        }
        return true;
    }
}