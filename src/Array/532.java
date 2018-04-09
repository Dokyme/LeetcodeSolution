class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int target=0;
        int count=0;
        Map<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            target=nums[i]+k;
            if(set.containsKey(target)&&set.get(target)!=i){
                count++;
                set.remove(target);
            }
        }
        return count;
    }
}