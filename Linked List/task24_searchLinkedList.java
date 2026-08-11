// public class task24_searchLinkedList {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static void main(String args[]){
       

//     }
//     public static boolean search(int key){
//         Node temp=head;
//         while(temp!=null){
//             if(temp.data==key){
//                 return true;
//             }
//             temp=temp.next;
//         }
//         return false;
//     }
//     public static boolean recursive(Node head,int key){
//         if(head==null){
//             return false;
//         }
//         if(head.data==key){
//             return true;
//         }
//         return recursive(head.next, key);
//     }
    
// }
public class task24_searchLinkedList { 
    
    static class Node { 
        int data; 
        Node next; 
        Node(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 
    
    public static Node head; 
    public static Node tail; 

    // Helper method to add nodes to the linked list
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Helper method to print the linked list visually
    public static void printList() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // 1. Populate the linked list with sample data
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        // 2. Display the constructed list
        printList();
        System.out.println("---------------------------------------");

        // 3. Define target search keys
        int key1 = 30; // Key that exists
        int key2 = 99; // Key that does not exist

        // 4. Demonstrate Iterative Search
        System.out.println("[ITERATIVE SEARCH RESULTS]");
        System.out.println("Is " + key1 + " in the list? -> " + search(key1));
        System.out.println("Is " + key2 + " in the list? -> " + search(key2));
        System.out.println("---------------------------------------");

        // 5. Demonstrate Recursive Search
        System.out.println("[RECURSIVE SEARCH RESULTS]");
        System.out.println("Is " + key1 + " in the list? -> " + recursive(head, key1));
        System.out.println("Is " + key2 + " in the list? -> " + recursive(head, key2));
    } 

    // Your working Iterative Search method
    public static boolean search(int key) { 
        Node temp = head; 
        while (temp != null) { 
            if (temp.data == key) { 
                return true; 
            } 
            temp = temp.next; 
        } 
        return false; 
    } 

    // Your working Recursive Search method
    public static boolean recursive(Node head, int key) { 
        if (head == null) { 
            return false; 
        } 
        if (head.data == key) { 
            return true; 
        } 
        return recursive(head.next, key); 
    } 
}
