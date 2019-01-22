class Solution {
    public int maxDistToClosest(int[] seats) {
        int last=-1;
        int distance=-1;
        int i;
        for(i=0;i<=seats.length;i++){
            if(i==seats.length){
               if(i-1-last>distance){
                   distance=i-1-last;
               }
                break;
            }
            if(seats[i]==1){
                if(last==-1){
                    distance=i;
                }else{
                    int mid=last+(i-last)/2;
                    if(mid-last>distance){
                        distance=mid-last;
                    }
                }
                last=i;
            }
        }
        return distance;
    }
}