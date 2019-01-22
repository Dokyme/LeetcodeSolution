class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    List<Integer> tup=new ArrayList();
                    tup.add(nums[i]);
                    tup.add(nums[j]);
                    tup.add(nums[k]);
                    res.add(tup);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k&&k<nums.length-1&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}