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


    public void enqueue(Node tmpStudent) {
        tmpStudent.next = this.back;
        this.back = tmpStudent;

    }

    public void dequeue() {
        if (this.back == null) {
            System.out.println("queue is empty");
        } else if (this.back.next == null) { // if have only one element in queue
            this.back = null;
        } else {
            Node tmp = this.back;
            // Traverse queue until we reach the second element
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            // Remove first element
            tmp.next = null;
        }

    }

    public void displayQueue() {
        if (this.back == null) {
            System.out.println("Queue is empty");
        } else {
            Node tmp = this.back;
            while (tmp != null) {
                System.out.printf(tmp.getInfo().getName() + tmp.getInfo().getName() + tmp.getInfo().getName() + "in Hogwarts");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
}