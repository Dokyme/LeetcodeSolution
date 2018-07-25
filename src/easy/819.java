class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> banset=new HashSet();
        Map<String,Integer> map=new HashMap();
        for(String ban:banned){
            banset.add(ban.toLowerCase());
        }
        char[] chs=paragraph.toCharArray();
        int last=-1;
        for(int i=0;i<chs.length;i++){
            if(chs[i]==' '||chs[i]=='!'||chs[i]=='?'||chs[i]=='\''||chs[i]==','||chs[i]==';'||chs[i]=='.'){
                if(last==i-1){
                    last=i;
                }else{
                    String raw=paragraph.substring(last+1,i);
                    String lower=raw.toLowerCase();
                    last=i;
                    if(banset.contains(lower)){
                        continue;
                    }
                    map.put(lower,map.getOrDefault(lower,0)+1);
                }
            }
        }
        if(chs[chs.length-1]!=' '&&chs[chs.length-1]!='!'&&chs[chs.length-1]!='?'&&chs[chs.length-1]!='\''&&chs[chs.length-1]!=','&&chs[chs.length-1]!=';'&&chs[chs.length-1]!='.'){
            String raw=paragraph.substring(last+1,chs.length).toLowerCase();
            if(!banset.contains(raw)){
                map.put(raw,map.getOrDefault(raw,0)+1);
            }

        }
        
        int maxCount=0;
        String maxStr=null;
        for(String str:map.keySet()){
            if(map.get(str)>maxCount){
                maxCount=map.get(str);
                maxStr=str;
            }
        }
        return maxStr;
    }
}