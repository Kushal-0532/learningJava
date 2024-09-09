import com.sun.source.tree.Tree;

public class TreesUsingLinkedList {
    TreeNode root;

//    void addElement(int n) {
//        TreeNode newNode = new TreeNode(n);
//        TreeNode current = root;
//
//        if (root == null) {
//            root = newNode;
//            return;
//        }
//
//        while (true) {
//            if (newNode.data > current.data) {
//                if (current.right == null) {
//                    current.right = newNode;
//                    break;
//                }
//                current = current.right;
//            } else {
//                if (current.left == null) {
//                    current.left = newNode;
//                    break;
//                }
//                current = current.left;
//            }
//        }
//    }

    void addElement(int n, TreeNode root){
        if (root == null) {
            this.root = new TreeNode(n);
            return;
        }
        if (root.data > n) {
            if (root.left == null) {
                root.left = new TreeNode(n);
            } else {
                addElement(n, root.left);
            }
        } else if (root.data < n) {
            if (root.right == null) {
                root.right = new TreeNode(n);
            } else {
                addElement(n, root.right);
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


    void search(int n, TreeNode current){
        if(current==null){
            System.out.println("Not found!");   // If reached leaf node
            return;
        }
        if(current.data==n){
            System.out.println("Found!");
        }
        if(n> current.data){                   // Traverse depending on if > or <
            search(n,current.right);
        }
        else if(n<current.data){
            search(n,current.left);
        }

    }

    void removeElement(int n){
        TreeNode current = root;
        while(current.data!=n){
            if(current.data>n){
                current=current.left;
            }
            else{
                current=current.right;
            }
        }

        //Case 1: no child nodes
        if(current.left==null && current.right==null){
            current=null;
        }
        //Case 2: 1 child node
        else if(current.left!=null || current.right!=null){

        }
    }

    public static void main(String[] args) {
        TreesUsingLinkedList tree = new TreesUsingLinkedList();
        //Perform obj.add() on these numbers 15, 10, 20, 8, 12, 17, 25
//        obj.addElement(15);
//        obj.addElement(10);
//        obj.addElement(20);
//        obj.addElement(8);
//        obj.addElement(12);
//        obj.addElement(17);
//        obj.addElement(25);
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(8);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(25);
        tree.print(tree.root);
        tree.search(11,tree.root);
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