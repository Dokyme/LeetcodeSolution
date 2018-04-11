class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet();
        for(int num:nums1){
            set1.add(num);
        }
        Set<Integer> set2=new HashSet();
        for(int num:nums2){
            set2.add(num);
        }
        Set<Integer> res=new HashSet();
        for(int num:set1){
            if(set2.contains(num)){
                res.add(num);
            }
        }
        int[] result=new int[res.size()];
        Iterator<Integer> itr=res.iterator();
        for(int i=0;i<res.size();i++){
            result[i]=itr.next();
        }
        return result;
        
    }
}