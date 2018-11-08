/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        List<Interval> res=new ArrayList();
        if(intervals.size()==0){
            return res;
        }
        int lo=intervals.get(0).start,hi=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start>hi){
                res.add(new Interval(lo,hi));
                lo=intervals.get(i).start;
            }
            if(intervals.get(i).end>hi){
                hi=intervals.get(i).end;
            }
        }
        res.add(new Interval(lo,hi));
        return res;
    }
}