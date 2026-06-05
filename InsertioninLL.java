class InsertionLL {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);

        n1.next = n2;

        n1 = atStart(30, n1);
        n1 = atEnd(40, n1);
        n1 = middle(35, 2, n1);
        printList(n1);

    }
    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    static Node atStart(int val, Node head){
        Node newNode = new Node(val);
        newNode.next = head;
        
        return newNode;
    }
    static Node atEnd(int val, Node head){
    Node newNode = new Node(val);

    if (head == null) {
        return newNode;
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;

    return head;
}

    static Node middle(int val, int pos, Node head){
        Node temp = head;
        Node newNode = new Node(val);
        for(int i = 0; i < pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode; 
        return head;
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
