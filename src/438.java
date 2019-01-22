class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        s=s.toLowerCase();
        p=p.toLowerCase();
        List<Integer> res=new ArrayList();
        int[] letter=new int[256];
        for(char ch:p.toCharArray()){
            letter[ch]++;
        }
        int start=0,end=0,diff=p.length();
        while(end<s.length()){
            if(letter[s.charAt(end)]>0){
                diff--;
            }
            letter[s.charAt(end)]--;
            end++;
            if(diff==0){
                res.add(start);
            }
            if(end-start==p.length()){
                if(letter[s.charAt(start)]>=0){
                    diff++;
                }
                letter[s.charAt(start)]++;
                start++;
            }
        }
        return res;
    }
}