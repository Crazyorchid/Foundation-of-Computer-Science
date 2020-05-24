public class Node extends Patient {
    protected Node next;
    protected Patient patient;

    public Node(Patient patient) {
        super();
        this.patient = patient;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void printNode() {
        // Check if it's empty
        if(this.patient==null) {
            System.out.println("Stack is empty.");
        }else{
                Patient tmp = this.patient;
                while(tmp!=null){
                    System.out.println(tmp.getName());
                    tmp = tmp.next;
            }
            System.out.println();
        }
    }
}
