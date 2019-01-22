class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList();
        helper(res,new Stack(),s,0,0);
        return res;
    }
    
    private void helper(List<String> res,Stack<Integer> stack,String s,int pos,int seg){
        if(seg==4){
            if(pos!=s.length()){
                return;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:stack){
                sb.append(i).append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            res.add(sb.toString());
            return;
        }
        if(pos>=s.length()){
            return;
        }
        if(s.charAt(pos)=='0'){
            stack.push(0);
            helper(res,stack,s,pos+1,seg+1);
            stack.pop();
            return;
        }
        if(seg==3&&pos<s.length()-3){
            return;
        }
        int t1=Integer.valueOf(s.substring(pos,Math.min(s.length(),pos+3)));
        if(t1<=255){
            stack.push(t1);
            helper(res,stack,s,pos+3,seg+1);
            stack.pop();
        }
        int t2=Integer.valueOf(s.substring(pos,Math.min(s.length(),pos+2)));
        stack.push(t2);
        helper(res,stack,s,pos+2,seg+1);
        stack.pop();
        int t3=Integer.valueOf(s.substring(pos,Math.min(s.length(),pos+1)));
        stack.push(t3);
        helper(res,stack,s,pos+1,seg+1);
        stack.pop();
    }
}