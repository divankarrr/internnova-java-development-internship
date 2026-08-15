
public class task25_circularLL {
    static class Node {
        int data;
        Node next;
        Node prev; 

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    static Node addToEmpty(Node last, int data) {
        if (last != null) return last;
        
       
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last; // Points to itself
        return last;
    }

    static Node addFront(Node last, int data) {
        if (last == null) return addToEmpty(last, data);
        
        
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null) return addToEmpty(last, data);
        
       
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode; // Move the last pointer to the new end node
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null) return null;
        
        Node p = last.next;
        do {
            if (p.data == item) {
                
                Node newNode = new Node(data);
                newNode.next = p.next;
                p.next = newNode;
                if (p == last) {
                    last = newNode;
                }
                return last;
            }
            p = p.next;
        } while (p != last.next);
        
        System.out.println("\n" + item + " - The given node is not present in the list");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if (last == null) return null;

        // Case 1: Only one node in the list and it matches the key
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last;
        
        // Case 2: The node to be deleted is the 'last' node
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp; 
            return last;
        }

        // Case 3: The node is somewhere else in the list
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next.data == key) {
            Node d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node p = last.next; // Start from head (last.next)
        System.out.print("Current List: ");
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println(); 
    }

    public static void main(String[] args) {
        Node last = null;
        
        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);
        
        traverse(last); // Output: 2 10 6 8 
        
        last = deleteNode(last, 8);
        traverse(last); // Output: 2 10 6 
    }
}

