public class MyBST {
    private Node root;

    //initialise an empty tree in the constructor;
    public MyBST() {
        this.root = null;
    }

    public MyBST(int data) {
        this.root = new Node(data);
    }

    public Node insertRec(Node current, int value) {
        if (current == null) {
            current = new Node(value);
            return current;

        } else {
            //going left side
            if (value < current.getData()) {
                current.setLeft(insertRec(current.getLeft(), value));
            } else if (value > current.value) { //going right side when greater than the current
                current.setRight(insertRec(current.getRight(), value));

            } else if (value == current.value) {//getting the same number then set as nothing returned
                System.out.println("\nNode:" + value + " is in the tree");
            }
            return current;
        }
    }

    public void insert(int value) {
        this.root = this.insertRec(this.root, value);
    }

    public boolean searchRec(Node current, int value) {
        //if not return false
        if (current == null) {
            return false;
        } else {
            //if equals return true
            if (value == current.getData()) {
                return true;
            } else if (value < root.getData()) {
                return searchRec(current.getLeft(), value);

            } else if (value > current.getData()){
                return searchRec(current.getRight(), value);
            }
            return false;
        }

    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node current) {
        if (current != null) {
            inorderRec(current.getLeft());
            System.out.print(current.getData() + " ");
            inorderRec(current.getRight());

        }
    }
}

