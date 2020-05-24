public class Node {
    private String data; // the data saved in this node;
    private Node next; //reference to another node;

    public Node() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Node next) {
        this.next = null;
    }

    public void printNode() {
        System.out.println("Node data" + data);
    }
}
