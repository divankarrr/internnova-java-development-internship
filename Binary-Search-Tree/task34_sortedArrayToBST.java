public class task34_sortedArrayToBST {
 

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
    public static Node createBST(int nums[],int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        Node root=new Node(nums[mid]);
        root.left=createBST(nums, low, mid-1);
        root.right=createBST(nums, mid+1, high);
        return root;
    }
    
    
    public static void main(String args[]){
        int values[]={3,5,6,8,10,11,12};
        Node root=createBST(values, 0, values.length-1);
        
        preorder(root);
        System.out.println();
        
       

    }
    
}
