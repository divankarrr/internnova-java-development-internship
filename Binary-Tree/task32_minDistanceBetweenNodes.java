public class task32_minDistanceBetweenNodes {
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
    public static Node lca2(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left, n1, n2);
        Node rightlca=lca2(root.right, n1, n2);
        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);
        if(leftDist==-1   && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }

    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;


    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Node root=BinaryTree.buildTree(nodes);
        int n1=4,n2=6;
        System.out.println(minDist(root, n1, n2));
        
        
    }
    

    
}
/*
distance lca to n1
distance lca to n2
dist +dist =min distance between n1 and n2 

*/
