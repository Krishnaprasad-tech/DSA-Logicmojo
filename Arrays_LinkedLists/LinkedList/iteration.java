package Arrays_LinkedLists.LinkedList;

public class iteration {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /*static void printListIterative(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }*/

    static void printListRecursive(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " -> ");
        printListRecursive(head.next);
        
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printListRecursive(head);
        System.out.println("null");
    }
}
