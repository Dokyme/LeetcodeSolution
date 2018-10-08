class Solution {
    private int maxn;
    private Map<Integer,Boolean> canWin;
    
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(maxChoosableInteger>=desiredTotal){
            return true;
        }
        if((1+maxChoosableInteger)*maxChoosableInteger/2<desiredTotal){
            return false;
        }
        maxn=maxChoosableInteger;
        canWin=new HashMap();
        return canWin(desiredTotal,0);
    }
    
    private boolean canWin(int remains,int state){
        if(canWin.containsKey(state)){
            return canWin.get(state);
        }
        for(int i=1;i<=maxn;i++){
            int mask=1<<i;
            if(!hasUsed(state,i)&&(i>=remains||!canWin(remains-i,state|mask))){
                canWin.put(state,true);
                return true;
            }
        }
        canWin.put(state,false);
        return false;
    }
    
    private boolean hasUsed(int visited,int i){
        return ((visited>>i)&1)==1;   
    }
}