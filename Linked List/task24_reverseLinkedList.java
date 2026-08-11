// public class task24_reverseLinkedList {
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
       
//         print();
//         reverse();
//         System.out.println();
//         print();


//     }
//     public static void reverse(){
//         Node prev=null;
//         Node curr=head;
//         Node next=null;
//         tail=head;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     public static void print(){
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
// }
public class task24_reverseLinkedList {
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

    // Added: Helper method to add data to the linked list
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

    public static void main(String args[]) {
        // 1. Populate the linked list with sample data
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        // 2. Print original list
        System.out.print("Original List: ");
        print();
        System.out.println();

        // 3. Reverse the list
        reverse();

        // 4. Print reversed list
        System.out.print("Reversed List: ");
        print();
        System.out.println();
    }

    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        tail = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
