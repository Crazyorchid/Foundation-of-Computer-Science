public class Node {

    public String value;
    public Node next;

    public Node(int j) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

    public void printNode(){
        System.out.println("Node: " + index);
    }
}
