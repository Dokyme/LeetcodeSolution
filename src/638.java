class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(new HashMap(),price,special,needs);
    }
    
    private int helper(Map<String,Integer> map,List<Integer> price,List<List<Integer>> specials,List<Integer> needs){
        if(map.containsKey(needs.toString())){
            return map.get(needs.toString());
        }
        int min=direct(price,needs);
        for(List<Integer> offer:specials){
            List<Integer> remain=reduce(needs,offer);
            int offerPrice=offer.get(offer.size()-1);
            if(remain!=null){
                min=Math.min(min,helper(map,price,specials,remain)+offerPrice);
            }
        }
        map.put(needs.toString(),min);
        return min;
    }
    
    private List<Integer> reduce(List<Integer> needs,List<Integer> offer){
        List<Integer> remains=new ArrayList();
        for(int i=0;i<needs.size();i++){
            if(needs.get(i)<offer.get(i)){
                return null;
            } 
            remains.add(needs.get(i)-offer.get(i));
        }
        return remains;
    }
    
    private int direct(List<Integer> price,List<Integer> needs){
        int res=0;
        for(int i=0;i<needs.size();i++){
            res+=price.get(i)*needs.get(i);
        }
        return res;
    }
}