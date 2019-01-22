class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer,Map<Integer,Integer>> map=new HashMap();
        for(int[] flight:flights){
            if(!map.containsKey(flight[0])){
                map.put(flight[0],new HashMap());
            }
            map.get(flight[0]).put(flight[1],flight[2]);
        }
        Queue<int[]> queue=new PriorityQueue<>((a,b)->(Integer.compare(a[0],b[0])));
        queue.offer(new int[]{0,src,k});
        while(!queue.isEmpty()){
            int[] minPrice=queue.poll();
            int price=minPrice[0];
            int city=minPrice[1];
            int stops=minPrice[2];
            if(city==dst)return price;
            if(stops>=0){
                Map<Integer,Integer> adjs=map.getOrDefault(city,new HashMap());
                for(int adj:adjs.keySet()){
                    queue.offer(new int[]{price+adjs.get(adj),adj,stops-1});
                }
            }
        }
        return -1;
    }
}

class Solution {
    
    class City implements Comparable<City>{
        int costFromSrc;
        int stopFromSrc;
        int id;
        
        City(int id,int cost,int stop){
            this.id=id;
            costFromSrc=cost;
            stopFromSrc=stop;
        }
        
        public int compareTo(City c){
            return costFromSrc-c.costFromSrc;
        }
    }
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] adjsTo=new int[n][n];
        for(int[] f:flights){
            adjsTo[f[0]][f[1]]=f[2];
        }
        int[] currentMinCost=new int[n];
        Arrays.fill(currentMinCost,Integer.MAX_VALUE);
        currentMinCost[src]=0;
        int[] currentMinStop=new int[n];
        Arrays.fill(currentMinStop,Integer.MAX_VALUE);
        currentMinStop[src]=0;
        PriorityQueue<City> pq=new PriorityQueue<>();
        pq.add(new City(src,0,0));
        while(!pq.isEmpty()){
            City city=pq.poll();
            if(city.id==dst)return city.costFromSrc;
            if(city.stopFromSrc>k)continue;
            int[] priceTo=adjsTo[city.id];
            for(int nextCity=0;nextCity<n;nextCity++){
                if(priceTo[nextCity]!=0){
                    int newCost=city.costFromSrc+priceTo[nextCity];
                    int newStop=city.stopFromSrc+1;
                    if(newCost<currentMinCost[nextCity]){
                        pq.offer(new City(nextCity,newCost,newStop));
                        currentMinCost[nextCity]=newCost;
                    }else if(newStop<currentMinStop[nextCity]){
                        pq.offer(new City(nextCity,newCost,newStop));
                        currentMinStop[nextCity]=newStop;
                    }
                }
            }
        }
        return currentMinCost[dst]==Integer.MAX_VALUE?-1:currentMinCost[dst];
    }
}