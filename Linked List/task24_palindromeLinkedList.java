// public class task24_palindromeLinkedList {
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
//     public static Node findmid(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
   
//     public static boolean checkPalindrome(){
//         if(head==null || head.next==null){
//             return true;
//         }
//         Node middle=findmid(head);
//         Node prev=null;
//         Node curr=middle;
//         Node next=null;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node right=prev;
//         Node left=head;
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }
    
// }
// /*

// 1.find mid
// 2.reverse 2nd half
// 3.check if(1st half==2nd half){
// }
// */
public class task24_palindromeLinkedList {
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // --- Test Case 1: Palindrome List (1 -> 2 -> 2 -> 1) ---
        addLast(1);
        addLast(2);
        addLast(2);
        addLast(1);
        
        System.out.print("List 1: ");
        printList();
        System.out.println("Is List 1 a Palindrome? -> " + checkPalindrome());
        System.out.println("----------------------------------------");

        // Clear list for the next test case
        head = null;
        tail = null;

        // --- Test Case 2: Non-Palindrome List (1 -> 2 -> 3) ---
        addLast(1);
        addLast(2);
        addLast(3);

        System.out.print("List 2: ");
        printList();
        System.out.println("Is List 2 a Palindrome? -> " + checkPalindrome());
    }

    public static Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        
        // FIX: Ensure fast and fast.next are verified before jumping two steps ahead
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Returns the exact middle node (or first middle for even lists)
    }
   
    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        
        // Step 1: Find middle node
        Node middle = findmid(head);
        
        // Step 2: Reverse the second half 
        // FIX: Start reversing from middle.next to avoid corrupting the list structure
        Node prev = null;
        Node curr = middle.next; 
        Node next;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev; // Head of the reversed second half
        Node left = head;  // Head of the first half
        
        // Step 3: Compare both halves
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
