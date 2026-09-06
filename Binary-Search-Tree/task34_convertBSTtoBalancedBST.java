import java.util.*;
public class task34_convertBSTtoBalancedBST {
    
    static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
    public static void preorder(Node root){
        if(root!=null){
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static void inorder(Node root,ArrayList<Integer> sorted){
        if(root!=null){
        inorder(root.left,sorted);
        sorted.add(root.data);
        inorder(root.right,sorted);
        }
    }
    public static Node createBST(ArrayList<Integer>nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        Node root=new Node(nums.get(mid));
        root.left=createBST(nums, low, mid-1);
        root.right=createBST(nums, mid+1, high);
        return root;
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
    public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer> sorted=new ArrayList<>();
        inorder(root,sorted);
        //sorted inorder --> balanced BST
        return createBST(sorted, 0, sorted.size()-1);

    }
    
    
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        
        
        preorder(root);
        System.out.println();
         preorder(balancedBST(root));
        
       

    }
    
}
