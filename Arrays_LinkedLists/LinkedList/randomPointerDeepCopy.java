package Arrays_LinkedLists.LinkedList;


public class randomPointerDeepCopy {
    
    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static void main(String[] args) {
        
            
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        
        Node copiedHead = copyRandomList(n1);

        // Verify by printing (example: val + random's val)
        Node curr = copiedHead;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.println("Node val: " + curr.val + ", Random points to: " + randomVal);
            curr = curr.next;
        }
    }
    

    
    public static Node copyRandomList(Node head) {
        //write logic on your own;
        return head;
    }
    
}
