public class task32_kthAncestor {
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
        
    }
    
    public static int kthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=kthAncestor(root.left, n, k);
        int rightDist=kthAncestor(root.right, n, k);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Node root=BinaryTree.buildTree(nodes);
        int n=4,k=2;
        System.out.println(kthAncestor(root, n, k));
        
        
    }
    

    
}


