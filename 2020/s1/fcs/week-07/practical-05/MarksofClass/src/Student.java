import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Student {
    private String name;
    private int physics;
    private int chemistry;
    private int math;
    private double average;

    public Student(String name, int physics, int chemistry, int math) {

        this.name = name;

        this.physics = physics;

        this.chemistry = chemistry;

        this.math = math;

        // calculate the average

        this.average = (this.math + this.physics + this.chemistry) / 3;

    }
    public String getName() {

        return this.name;

    }

    public int getMath() {

        return this.math;

    }

    public int getChemistry() {

        return this.chemistry;

    }

    public int getPhysics() {

        return this.physics;

    }

    public double getAverage() {

        return this.average;

    }

    // mutator methods

    public void setName(String name) {

        this.name = name;

    }

    public void setMath(int math) {

        this.math = math;

    }

    public void setChemistry(int chem) {

        this.chemistry = chem;

    }

    public void setPhysic(int phy) {

        this.physics = phy;

    }

    public void setAverage() {

        this.average = (this.math + this.physics + this.chemistry) / 3;

    }
    private static Student[] readData(String filename) {

        // a student array to store students

        Student[] students =null;

        try {

            ArrayList<Student> al=new ArrayList<>();

            // convert file to a scanner object

            Scanner x = new Scanner(new File(filename));



            // counter to store count of students

            int index = 0;

            // now while the file has new lines repeat the loop

            while (x.hasNext()) {

                // read the line

                String line[] = x.nextLine().trim().split(" ");

                // extract data form the line

                String name = line[0];

                int phy = Integer.parseInt(line[1]);

                int chem = Integer.parseInt(line[2]);

                int math = Integer.parseInt(line[3]);

                // create and add a student object to teh student array using the above data

                al.add(new Student(name, phy, chem, math));



            }

            // finally close the file

            x.close();

            //convert the arraylist to student array

            students=new Student[al.size()];

            for(int i=0;i<al.size();i++)

                students[i]=al.get(i);



        } catch (FileNotFoundException e) {

            System.out.println(filename + " not found...");

            System.exit(0);

        }

        // return the students array

        return students;

    }

    //method to sort teh students and return the sorted result

    public static Student[] sortStudents(Student[] students)

    {

        //copy teh original array into new array to sort the new array

        Student sortedStudnets[]=students;

        //perform bubble sort

        for(int i=0;i<sortedStudnets.length-1;i++)

        {

            for(int j=0;j<sortedStudnets.length-i-1;j++)

            {

                //check if teh current students avg marks is less tahn next student

                //if yes then sqap them

                if(sortedStudnets[j].getAverage()<sortedStudnets[j+1].getAverage())

                {

                    //store current student in a temp object

                    Student temp=sortedStudnets[j];

                    sortedStudnets[j]=sortedStudnets[j+1];

                    sortedStudnets[j+1]=temp;

                }

                //this case is if the averrage marks are same

                else if(sortedStudnets[j].getAverage()==sortedStudnets[j+1].getAverage())

                {

                    //compare their physics marks

                    if(sortedStudnets[j].getPhysics()<sortedStudnets[j+1].getPhysics())

                    {

                        //store current student in a temp object

                        Student temp=sortedStudnets[j];

                        sortedStudnets[j]=sortedStudnets[j+1];

                        sortedStudnets[j+1]=temp;

                    }

                    //if physics marks is also same then check for chem marks

                    else if(sortedStudnets[j].getPhysics()==sortedStudnets[j+1].getPhysics())

                    {

                        //compare their chemistry marks

                        if(sortedStudnets[j].getChemistry()<sortedStudnets[j+1].getChemistry())

                        {

                            //store current student in a temp object

                            Student temp=sortedStudnets[j];

                            sortedStudnets[j]=sortedStudnets[j+1];

                            sortedStudnets[j+1]=temp;

                        }

                        //if chemistry marks is also same then check for maths marks

                        else if(sortedStudnets[j].getChemistry()==sortedStudnets[j+1].getChemistry())

                        {

                            //compare their maths marks

                            if(sortedStudnets[j].getMath()<sortedStudnets[j+1].getMath())

                            {

                                //store current student in a temp object

                                Student temp=sortedStudnets[j];

                                sortedStudnets[j]=sortedStudnets[j+1];

                                sortedStudnets[j+1]=temp;

                            }

                            //if maths marks is also same then sort as per name

                            else if(sortedStudnets[j].getMath()==sortedStudnets[j+1].getMath())

                            {

                                //compare their names

                                if(sortedStudnets[j].getName().compareTo(sortedStudnets[j+1].getName())>0)

                                {

                                    //store current student in a temp object

                                    Student temp=sortedStudnets[j];

                                    sortedStudnets[j]=sortedStudnets[j+1];

                                    sortedStudnets[j+1]=temp;

                                }

                            }

                        }

                    }

                }

            }

        }

        return sortedStudnets;

    }

    //print method to dipaly teh data

    public static void printStudents (Student []students)

    {

        //display the header

        System.out.printf("%15s%15.2s%15s%15s%15s\n","Student","AverageScore","Physics","Chemistry","Maths");

        //display teh data in the array

        for(Student s:students)

        {

            System.out.printf("%15s%15.2f%15d%15d%15d\n",s.getName(),s.getAverage(),s.getPhysics(),s.getChemistry(),s.getMath());

        }

    }
}
