public class task30_countNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node temp=new Node(nodes[idx]);
            temp.left=buildTree(nodes);
            temp.right=buildTree(nodes);
            return temp;
        }
        public static int countNode(Node root){
            if(root==null){
                return 0;
            }
            int l=countNode(root.left);
            int r=countNode(root.right);
            return l+r+1;
        }
        
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        int count=tree.countNode(root);
        System.out.println(count);
        
        
    }
    
}
