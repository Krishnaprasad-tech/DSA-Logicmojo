package Arrays_LinkedLists.LinkedList;

public class kth_Node {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int kthFromEnd(Node head, int k) {
        if (head == null || k <= 0) {
            return -1; // Invalid input
        }

        Node first = head;
        Node second = head;

        // Move first pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (first == null) {
                return -1; // k is greater than the length of the list
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data; // second pointer is now at the kth node from the end
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        int result = kthFromEnd(head, k);
        if (result != -1) {
            System.out.println(k + "th node from the end is: " + result);
        } else {
            System.out.println("Invalid input or k is greater than the length of the list.");
        }
    }
}
