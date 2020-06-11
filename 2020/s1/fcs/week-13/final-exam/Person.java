public class Person {
    private String name;
    private int age;

    public Person() {
        name = "anon";
        age = -1;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
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

    public String toString(){
        return "Person: " + name + " is age:" + age;
    }
}
