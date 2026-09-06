
public class task33_mirrorBST {
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
    public static void preorder(Node root){
        if(root!=null){
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
    // 1. Mirror both subtrees first and store them in temporary variables
    Node leftMirror = mirrorBST(root.left);
    Node rightMirror = mirrorBST(root.right);
    
    // 2. Swap the pointers
    root.left = rightMirror;
    root.right = leftMirror;
        return root;
    }

    
    
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        preorder(root);
        System.out.println();
        preorder(mirrorBST(root));

        
        
       

    }
    
}
