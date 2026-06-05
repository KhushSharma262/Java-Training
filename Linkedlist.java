class Linkedlist {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;

        printList(n1);
    }
    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}