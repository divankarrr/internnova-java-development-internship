public class task31_subTree {
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
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node temp=new Node(nodes[idx]);
            temp.left=buildTree(nodes);
            temp.right=buildTree(nodes);
            return temp;
        }     
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

         return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        BinaryTree.idx = -1;
        int sub[]={2,4,-1,-1,5,-1,-1};
        Node subtree=tree.buildTree(sub);
        System.out.println(isSubTree(root, subtree)); 
        
    }
    
}
/*
Given the roots of two binary trees root and subRoot,
return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise
*/