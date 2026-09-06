import java.util.*;
public class task34_sizeOfLargestBST {

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
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }

    }
    public static int maxBST=0;
    public static Info largetBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo=largetBST(root.left);
        Info rightInfo =largetBST(root.right);
        int size =leftInfo.size+rightInfo.size +1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        } 
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST=Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false, size, min, max);
        

    }
   
    
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

       Info info=largetBST(root);
       System.out.println(maxBST);
       

    }
    
}
