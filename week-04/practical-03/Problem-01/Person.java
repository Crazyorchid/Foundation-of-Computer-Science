public class Person {
    String giveName;
    String lastName;
    int age;
    String gender;
    String citizenship;
    //accessor
    public String getGender() {
        return gender;
    }
    //mutator
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }
//Basic constructor
    Person(){

    }
    //Parametric constructor
    Person(String giveName, String lastName, String gender, String citizenship, int age){}

    }