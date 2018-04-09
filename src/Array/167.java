class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices=new int[2];
        int left=0,right=numbers.length-1;
        int sum;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                indices[0]=left+1;
                indices[1]=right+1;
                return indices;
            }else if(sum>target) right--;
            else left++;
        }
        return indices;
    }
}