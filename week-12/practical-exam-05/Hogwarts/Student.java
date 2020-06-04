public class Student {
    public Node next;
    String name;
    int age;
    int period;
    private Node back;

    public Student() {
        name = "unknown";
        age = 0;
        period = 0;
    }

    public Student(String tmpName, int tmpAge, int tmpPeriod) {
        this.age = tmpAge;
        this.name = tmpName;
        this.period = tmpPeriod;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
