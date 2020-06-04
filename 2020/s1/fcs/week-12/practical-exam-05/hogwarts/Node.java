public class Node extends Student {
    public Student info;
    // Reference to the next node
    public Node next;

    // Parameterizing the student as the basic constructor
    public Node(Student tmpStudent) {
        this.info = tmpStudent;


    }

    public Student getInfo() {
        return info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
