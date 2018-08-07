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
    public List<Integer> preorder(Node root){
        if(root==null){
            return new ArrayList();
        }
        List<Integer> list=new ArrayList();
        visit(root,list);
        return list;
    }
    
    public void visit(Node node,List<Integer> list){
        if(node==null){
            return;
        }
        list.add(node.val);
        for(Node ch:node.children){
            visit(ch,list);
        }
    }
}