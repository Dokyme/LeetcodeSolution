class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res=0;
        Map<Integer,Integer> disCount=new HashMap();
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j){
                    continue;
                }
                int dis=distanceOf(points[i],points[j]);
                disCount.put(dis,disCount.getOrDefault(dis,0)+1);
            }
            for(int cnt:disCount.values()){
                res+=cnt*(cnt-1);
            }
            disCount.clear();
        }
        return res;
    }
    
    public int distanceOf(int[] p,int[] q){
        return (p[0]-q[0])*(p[0]-q[0])+(p[1]-q[1])*(p[1]-q[1]);
    }
}