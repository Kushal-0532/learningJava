

public class TreesUsingLinkedList {
    TreeNode root;

    void addElement(int n) {
        TreeNode newNode = new TreeNode(n);
        TreeNode current = root;

        if (root == null) {
            root = newNode;
            return;
        }

        while (true) {
            if (newNode.data > current.data) {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            } else {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            }
        }
    }

    void print(TreeNode current) {
        System.out.println(current.data);
        if (current.left != null) {
            print(current.left);
        }
        if (current.right != null) {
            print(current.right);
        }
    }

    public static void main(String[] args) {
        TreesUsingLinkedList obj = new TreesUsingLinkedList();
        //Perform obj.add() on these numbers 15, 10, 20, 8, 12, 17, 25
        obj.addElement(15);
        obj.addElement(10);
        obj.addElement(20);
        obj.addElement(8);
        obj.addElement(12);
        obj.addElement(17);
        obj.addElement(25);
        obj.print(obj.root);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}