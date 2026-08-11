
// public class task24_linkedlist{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public  Node head;
//     public  Node tail;
//     public static void main(String args[]){
//         task24_linkedlist ll=new task24_linkedlist();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(4);
//         ll.addMiddle(2, 3);
//         ll.addFirst(5);
//         System.out.println("Linked List: ");
//         ll.print();
//         System.out.println();
//         System.out.println("Size of Linked List: " + ll.sizeLinkedList());


//     }
//     /*
//     1.create new node
//     2.new node next=head
//     3.head=new node
    
//     */
//    //add first
//    public  void addFirst(int data){
//     Node newNode=new Node(data);
//     if(head==null){
//         tail=newNode;
//         head=newNode;
//         return;
//     }
//     newNode.next=head;
//     head=newNode;
    
//    }
//    /*
//    1.create a node
//    2.tail.next=newNode
//    3.tail=newNode
//    */
//    //addLast
//    public  void addLast(int data){
//     Node newNode=new Node(data);
//     if(head==null||tail==null){
//         head=newNode;
//         tail=newNode;
//         return;
//     }
//     tail.next=newNode;
//     tail=newNode;

//    }
//    //print
//    public  void print(){
//     if(head==null){
//         System.out.println("LinkedList is empty");
//         return;
//     }
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp=temp.next;
//     }
//    }
//    //add in the middle
//    public  void addMiddle(int index,int data){
//     if(index==0){
//         addFirst(data);
//         return;
//     }
//     Node temp=head;
//     int i=0;
//     while(i<index-1 && temp!=null){
//         temp=temp.next;
//         i++;
//     }
//     if (temp == null) {
//         System.out.println("Index out of bounds");
//         return;
//     }
//     Node newNode=new Node(data);
//     newNode.next=temp.next;
//     temp.next=newNode;
//    }
//    //size of linkedlist
//    public int sizeLinkedList(){
//     int size=0;
//     Node temp=head;
//     while(temp!=null){
//         size++;
//         temp=temp.next;
//     }
//     return size;
     
//    }


// }

public class task24_linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;
    public Node tail;

    public static void main(String args[]) {
        task24_linkedlist ll = new task24_linkedlist();
        
        // 1. Build out the list using all three insertion strategies
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addMiddle(2, 3); // Inserts 3 at index 2 (between 2 and 4)
        ll.addFirst(5);    // Inserts 5 at the front
        
        // 2. Display the structured visual matrix
        System.out.print("Linked List: ");
        ll.print();
        System.out.println();
        System.out.println("Size of Linked List: " + ll.sizeLinkedList());
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the entire linked list elements
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null"); // Clarifies structural end
    }

    // Add node at a specific positional index
    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        
        Node temp = head;
        int i = 0;
        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        
        // FIX: If the new node was appended at the very end, update tail pointer
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Computes total node length dynamically
    public int sizeLinkedList() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
