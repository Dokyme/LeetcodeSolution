class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        int size=0;
        String[] res=new String[list1.length];
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                min=Math.min(min,map.get(list2[i])+i);
            }
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                if(map.get(list2[i])+i==min){
                    res[size++]=list2[i];
                }
            }
        }
        return Arrays.copyOf(res,size);
    }
}