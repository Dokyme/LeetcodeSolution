class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> can=new HashSet();
        for(int i:candies){
            can.add(i);
        }
        return Math.min(can.size(),candies.length/2);
    }
}