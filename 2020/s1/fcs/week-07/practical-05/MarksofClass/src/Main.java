import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
public class Main {
    private static Student[] readData(String filename) {



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

                // create and add a studnet object to teh student array using the above data

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

        // retrurn the students array

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

                //check if teh current students avg marks is less than next student


                if(sortedStudnets[j].getAverage()<sortedStudnets[j+1].getAverage())

                {

                    //store current student in a temp object

                    Student temp=sortedStudnets[j];

                    sortedStudnets[j]=sortedStudnets[j+1];

                    sortedStudnets[j+1]=temp;

                }

                //this case is if the average marks are same

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

    //print method to display the data

    public static void printStudents (Student []students)

    {

        //display the header

        System.out.printf("%15s%15.2s%15s%15s%15s\n","Student","AverageScore","Physics","Chemistry","Maths");

        //display the data in the array

        for(Student s:students)

        {

            System.out.printf("%15s%15.2f%15d%15d%15d\n",s.getName(),s.getAverage(),s.getPhysics(),s.getChemistry(),s.getMath());

        }

    }
    public static void main(String[] args) {

        //read the file named as students.txt and store the result

        //in a students array

        Student students[] = readData("/home/runtao/UofA/FCS/Week7/practical-05/MarksofClass/src/students.txt");



        //now make call to sorted Students array

        students=sortStudents(students);

        //now display teh sorted students array data

        System.out.println("Sorted students list :\n");

        printStudents(students);

    }

}
