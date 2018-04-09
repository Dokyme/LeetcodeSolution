class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int another=target-nums[i];
            if(map.containsKey(another)&&map.get(another)!=i){
                return new int[]{i,map.get(another)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}