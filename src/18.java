class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList();
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int start=j+1,end=nums.length-1;
                while(start<end){
                    int sum=nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum>target){
                        end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        List<Integer> tup=new ArrayList();
                        tup.add(nums[i]);
                        tup.add(nums[j]);
                        tup.add(nums[start]);
                        tup.add(nums[end]);
                        res.add(tup);
                        while(start<end&&nums[start]==nums[start+1]){
                            start++;
                        }
                        while(start<end&&nums[end]==nums[end-1]){
                            end--;
                        }
                        start++;
                        end--;
                    }
                }
            }
        }
        return res;
    }
}