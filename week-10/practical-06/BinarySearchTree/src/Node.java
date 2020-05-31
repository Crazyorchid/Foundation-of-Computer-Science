public class Node {
    public int value;
    private int data;
    private Node left;
    private Node right;

    public Node() {
        //set constructors for the Node class and initialize the left and right to null
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

    //set mutators and accessors for Data, left and right.
        public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void printNode(){
        //print the data in the node
        System.out.println("Node data: " + data);
    }

}

