class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map=new HashMap();
        int res=0;
        for(int i:C){
            for(int j:D){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        
        for(int i:A){
            for(int j:B){
                res+=map.getOrDefault(-i-j,0);
            }
        }
        return res;
    }
}