/*==================================
Foundations of Computer Science
Student: Runtao Zhuge
id: a1778478
Semester: 1
Year: 2020
Practical Exam Number: 6
===================================*/
public class Queue {
    private Node back;

    public Queue() {
        this.back = null;
    }


    public void enqueue(Student tmpStudent) {
        Node newNode = new Node(tmpStudent);
        newNode.setNext(this.back);
        this.back = newNode;

    }

    public void dequeue() {
        if (this.back == null) {
            System.out.println("queue is empty");
        } else if (this.back.getNext() == null) { // if have only one element in queue
            this.back = null;
        } else {
            Node tmp = this.back;
            // Traverse queue until we reach the second element
            while (tmp.getNext().getNext() != null) {
                tmp = tmp.getNext();
            }
            // Remove first element
            tmp.next = null;
        }

    }

    public void displayQueue() {
        if (this.back == null) {
            System.out.println(" ");
        } else {
            Node tmp = this.back;
            while (tmp != null) {
                System.out.println(tmp.getInfo().getName() + " " + tmp.getInfo().getAge() + " years old" + " " + tmp.getInfo().getPeriod()+ "rd" + " " +"in Hogwarts;");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
}