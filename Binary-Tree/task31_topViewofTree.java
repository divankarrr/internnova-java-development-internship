import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
public class task31_topViewofTree {
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
    static class Info{
            Node node;
            int hd;
            public Info(Node node,int hd){
                this.node=node;
                this.hd=hd;

            }
    }
    public static void topView(Node node){
        //level order
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int max=0;
        int min=0;
        q.add(new Info(node, 0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){//first time my hd is comming
                map.put(curr.hd,curr.node);

            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
            }
            
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }

    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        topView(root);
        
        
    }
    
}

