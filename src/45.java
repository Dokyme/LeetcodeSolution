class Solution {
    public int jump(int[] nums) {
        if (nums.length<=1) return 0;
        int steps=0;
        int curmax=0;
        int nextmax=0;
        int i=0;
        while(true)
        {
            steps++;
            for (;i<=curmax;i++)
            {
                nextmax=Math.max(nextmax,nums[i]+i);
                if (nextmax>=nums.length-1) return steps;
            }
            curmax=nextmax;
        }
    }
}