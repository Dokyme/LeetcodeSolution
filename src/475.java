class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int dis=0;
        int i=0;
        for(int house:houses){
            while(i<heaters.length-1&&Math.abs(heaters[i]-house)>=Math.abs(heaters[i+1]-house)){
                i++;
            }
            dis=Math.max(dis,Math.abs(house-heaters[i]));
        }
        return dis;
    }
}