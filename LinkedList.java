public class LinkedList {
    public static void main(String[] args) {
        Node myLinkedNode = new Node(0);
        Node myLinkedNode1 = new Node(1);
        Node myLinkedNode2 = new Node(2);
        Node myLinkedNode3 = new Node(3);

        myLinkedNode.next = myLinkedNode1;
        myLinkedNode1.next = myLinkedNode2;
        myLinkedNode2.next = myLinkedNode3;
        printLinkedList(myLinkedNode);
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next; // Move to the next node
        }
    }

    
}

class Node {
    Node head;
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}