
public class task33_printInRange {
    static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        }
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return ;
        }
        // Case 1: Root lies within the range [k1, k2]
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }// Case 2: Root is strictly smaller than the lower bound k1 (Go Right)
        else if(root.data<k1){
            printInRange(root.right, k1, k2);
        } // Case 3: Root is strictly larger than the upper bound k2 (Go Left)
        else{
            printInRange(root.left, k1, k2);
        }

    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printInRange(root, 4, 7);
       

    }
    
}
