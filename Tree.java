class Tree{
    Node root;

    public void printPostorder(Node nod){
        if (nod == null) return ;
        
        printPostorder(nod.left);
        printPostorder(nod.right);
        System.out.print(nod.key + " ");
    }
    
    public void printPreorder(Node nod) {
        if (nod == null)
            return;

        System.out.print(nod.key + " ");
        printPreorder(nod.left);
        printPreorder(nod.right);
    }
    
    public void printInorder(Node nod) {
        if (nod == null)
            return;

        printInorder(nod.left);
        System.out.print(nod.key + " ");
        printInorder(nod.right);
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(15);
        tree.root.right = new Node(2);
        tree.root.left.right = new Node(9);
        tree.root.left.left = new Node(3);
        tree.root.right.right = new Node(4);
        tree.root.right.left = new Node(7);
        System.out.println("Preorder traversal: ");
        tree.printPreorder(tree.root);
        System.out.println("");
        System.out.println("Postorder Traversal: ");
        tree.printPostorder(tree.root);
        System.out.println("");
        System.out.println("Inorder Traversal: ");
        tree.printInorder(tree.root);
    }
}
class Node{
    int key;
    Node left;
    Node right;

    public Node(int x){
        key = x; left = right = null;
    }
}