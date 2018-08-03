/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null){
            return res;
        }
        Queue<Node> buf=new LinkedList();
        buf.offer(root);
        int size=1;
        while(!buf.isEmpty()){
            List<Integer> li=new ArrayList();
            for(int i=0;i<size;i++){
                Node n=buf.poll();


                
                li.add(n.val);
                for(Node ch:n.children){
                    buf.offer(ch);
                }
            }
            res.add(li);
            size=buf.size();
        }
        return res;
    }
}