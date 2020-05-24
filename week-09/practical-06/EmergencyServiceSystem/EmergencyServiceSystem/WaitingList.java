public class WaitingList extends Patient{
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //check if it is empty
        if(this.head == null){
            return null;
        }else{
            this.head = this.head.next;
        }
        return this.head.next;

    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public Patient addToList(Patient patient) {
        Patient tmp = null;

        if(this.head == null) {
            System.out.println("The stack is empty");
        }
            else{//find
                // the end of the list
                //tmp = this.head;

                while(tmp.next != null){
                    tmp = tmp.next;
                }

        }
        return tmp;
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        System.out.println(getId() + "," + getName() + "," + getTriageLevel());

    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
