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
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList();
        visit(root,list);
        return list;
    }
    
    private void visit(Node n,List<Integer> list){
        if(n==null){
            return;
        }
        for(Node c:n.children){
            visit(c,list);
        }
        list.add(n.val);
    }
}