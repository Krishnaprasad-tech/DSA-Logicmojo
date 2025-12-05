package Arrays_LinkedLists.LinkedList;

public class insertion {
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
        
        return head;
    }
    //2
    static Node insertionAtEnd(Node head,int val){
        return head;
    }
}
