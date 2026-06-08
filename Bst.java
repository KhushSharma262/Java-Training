class Bst {
    // 47, 82, 12, 68, 25, 93, 54, 1, 76, 39, 60, 18, 85, 31, 70
    Node root;

    public void printPostorder(Node nod) {
        if (nod == null)
            return;

        printPostorder(nod.left);
        printPostorder(nod.right);
        System.out.print(nod.val + " ");
    }

    public void printPreorder(Node nod) {
        if (nod == null)
            return;

        System.out.print(nod.val + " ");
        printPreorder(nod.left);
        printPreorder(nod.right);
    }

    public void printInorder(Node nod) {
        if (nod == null)
            return;

        printInorder(nod.left);
        System.out.print(nod.val + " ");
        printInorder(nod.right);
    }
    public static void main(String[] args) {
        int[] arr = {47, 82, 12, 68, 25, 93, 54, 1, 76, 39, 60, 18, 85, 31, 70};
        

        for (int i = 0; i < arr.length; i ++){
            
        }
    }
}
class Node{
    int val;
    Node left;
    Node right;

    public Node(int x){
        val = x; left = right = null;
    }
}
