class Solution {
    public int findLHS(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        Map<Integer,Integer> cnts=new HashMap();
        for(int i:nums){
            cnts.put(i,cnts.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int k:cnts.keySet()){
            if(cnts.containsKey(k+1)){
                res=Math.max(cnts.get(k)+cnts.get(k+1),res);
            }
        }
        return res;
    }
}