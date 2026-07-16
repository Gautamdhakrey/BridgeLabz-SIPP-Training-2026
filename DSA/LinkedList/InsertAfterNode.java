package LinkedList;

public class InsertAfterNode {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void insertAfter(Node current, int value) {

        if (current == null)
            return;

        Node newNode = new Node(value);

        newNode.next = current.next;

        current.next = newNode;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        display(head);

        insertAfter(head.next, 25);

        display(head);
    }
}
