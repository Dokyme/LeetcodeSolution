class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cnts=new int[26];
        int maxCount=0;
        int maxTaskCount=0;
        for(char task:tasks){
            cnts[task-'A']++;
            if(cnts[task-'A']==maxCount){
                maxTaskCount++;
            }else if(cnts[task-'A']>maxCount){
                maxCount=cnts[task-'A'];
                maxTaskCount=1;
            }
        }
        
        int emptySegs=maxCount-1;
        int avibSlots=emptySegs*(n-maxTaskCount+1);
        int avibTasks=tasks.length-maxCount*maxTaskCount;
        int idle=Math.max(0,avibSlots-avibTasks);
        return tasks.length+idle;
    }
}