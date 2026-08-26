public class task31_diameter {
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){//O(n2)
            if(root==null){
                return 0;
            }
            int dialeft=diameter(root.left);
            int diaright=diameter(root.right);
            int hl=height(root.left);
            int hr=height(root.right);
            int self=hl+hr+1;
            return Math.max(self,Math.max(dialeft,diaright));
        }
        static class Info{
            int dia;
            int ht;
            public Info(int dia,int ht){
                this.dia=dia;
                this.ht=ht;

            }
        }
        public static Info diameter2(Node root){//O(n)
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

            int dia=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(dia,ht);

        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        
        System.out.println(tree.diameter2(root).dia);
        
    }
    
}
/*
no of nodes in the longest path between 2 leaves
case 1 passing through root
case 2 passing through subtree

*/