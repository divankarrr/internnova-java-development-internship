
public class task33_searchBST {
    static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    //search in BST
    public static boolean searchBST(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return searchBST(root.left, key);
        }
        if(root.data<key){
            return searchBST(root.right, key);
        }
        return false;

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
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println(searchBST(root, 4));

    }
    
}
