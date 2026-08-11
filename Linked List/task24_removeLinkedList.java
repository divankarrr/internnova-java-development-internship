// public class task24_removeLinkedList {
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
//     public static int size;
//     public static int removeFirst(){
//         if(size==0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             head=null;
//             tail=null;
//             size=0;
//             return val;
//         }
//         int value=head.data;
//         head=head.next;
//         size--;
//         return value;
//     }
//     public static int removeLast(){
//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             size=0;
//             return val;
//         }

//         Node prev=null;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next;
//         }
//         int val=prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;

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
public class task24_removeLinkedList {
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
    public static int size = 0; // Tracks the size of the list dynamically

    // Helper method to add data to the linked list and increment size
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String args[]) {
        // 1. Build initial list
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        
        System.out.print("Original List: ");
        print();
        System.out.println(" (Size: " + size + ")");
        System.out.println("---------------------------------------");

        // 2. Test removeFirst()
        System.out.println("Removed First element: " + removeFirst());
        System.out.print("List after removeFirst: ");
        print();
        System.out.println(" (Size: " + size + ")");
        System.out.println("---------------------------------------");

        // 3. Test removeLast()
        System.out.println("Removed Last element: " + removeLast());
        System.out.print("List after removeLast: ");
        print();
        System.out.println(" (Size: " + size + ")");
    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null; // FIX: Clear head reference
            tail = null; // FIX: Clear tail reference
            size = 0;
            return val;
        }

        // FIX: Start tracking from head instead of null to prevent crash
        Node prev = head; 
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void print() {
        if (head == null) {
            System.out.print("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
