class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins.length<1&&amount!=0){
            return -1;
        }
        int[] numOfCoinsWhenChanging=new int[amount+1];
        return coinChange(coins,numOfCoinsWhenChanging,amount);
    }
    
    private int coinChange(int[] coins,int[] numOfCoinsWhenChanging,int remains){
        if(remains==0){
            return 0;
        }else if(remains<0){
            return -1;
        }else if(numOfCoinsWhenChanging[remains]!=0){
            return numOfCoinsWhenChanging[remains];
        }
        int min=Integer.MAX_VALUE;
        for(int coin:coins){
            int res=coinChange(coins,numOfCoinsWhenChanging,remains-coin);
            if(res>=0)
                min=Math.min(min,res+1);
        }
        numOfCoinsWhenChanging[remains]=(min==Integer.MAX_VALUE)?-1:min;
        return numOfCoinsWhenChanging[remains];
    }
}