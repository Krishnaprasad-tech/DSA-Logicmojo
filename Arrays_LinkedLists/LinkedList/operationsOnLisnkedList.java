package Arrays_LinkedLists.LinkedList;

public class operationsOnLisnkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static void printListRecursive(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " -> ");
        printListRecursive(head.next);
        
    }
    //1
    static Node insertionAtBeginning(Node head,int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }
    //2
    static Node insertionAtEnd(Node head,int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }


    static Node insertionAtPosition(Node head,int val,int pos){
        Node newNode = new Node(val);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for(int i=0;i<pos-1;i++){
            if(current == null){
                System.out.println("Position out of bounds");
                return head;
            }
            current = current.next;
        }
        if(current == null){
            System.out.println("Position out of bounds");
            return head;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    static Node searchNode(Node head,int key){
        Node current = head;
        while(current != null){
            if(current.data == key){
                System.out.println("Element found");
                return current;
            }
            current = current.next;
        }
        System.out.println("Element not found");
        return null;
    }
    static Node sizNode(Node head){
        Node current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        System.out.println("Size of the linked list is: " + size);
        return head;
    }
    static Node deleteNode(Node head,int key){
        if(head == null){
            return null;
        }
        if(head.data == key){
            return head.next;
        }
        Node current = head;
        while(current.next != null && current.next.data != key){
            current = current.next;
        }
        if(current.next == null){
            System.out.println("Element not found");
            return head;
        }
        current.next = current.next.next;
        return head;
    }
    static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    static Node recursiveReverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


       // head = insertionAtBeginning(head,8);
       //insertionAtEnd(head,8);
        head = reverseList(head);
        printListRecursive(head);
        System.out.println("null");
    }
}
