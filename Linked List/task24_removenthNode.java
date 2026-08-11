// public class task24_removenthNode {
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
//     public static void deleteNthNode(int n){
//         int size=0;
//         Node temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         if(n==size){
//             head=head.next;
//             return;
//         }
//         int i=1;
//         int index=size-n;
//         Node prev=head;
//         while(i<index){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return;


//     }
    
// }
public class task24_removenthNode {
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

    // Helper method to add data to the linked list
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
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // 1. Populate the linked list with 5 nodes
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        System.out.print("Original List: ");
        printList();

        // 2. Delete the 2nd node from the end (should remove 40)
        int n1 = 2;
        System.out.println("Deleting " + n1 + "nd node from the end...");
        deleteNthNode(n1);
        printList();
        System.out.println("----------------------------------------");

        // 3. Delete the 4th node from the end of the new list (should remove 10, the head)
        int n2 = 4;
        System.out.println("Deleting " + n2 + "th node from the end (New Head)...");
        deleteNthNode(n2);
        printList();
    }

    public static void deleteNthNode(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Edge Case: If n is greater than the size or list is empty
        if (size == 0 || n > size) {
            System.out.println("Invalid position!");
            return;
        }

        // Edge Case: If removing the head node
        if (n == size) {
            head = head.next;
            if (head == null) { // If the list had only one element, update tail
                tail = null;
            }
            return;
        }

        int i = 1;
        int index = size - n;
        Node prev = head;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        
        // Skip the targeted node
        prev.next = prev.next.next;
        
        // If the last node was removed, update the tail pointer
        if (prev.next == null) {
            tail = prev;
        }
    }
}
