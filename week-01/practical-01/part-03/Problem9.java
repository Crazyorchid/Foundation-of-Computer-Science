/* Student name: Runtao Zhuge 
Student ID:a1778478
Problem 09*/

//Import the scanner//
import java.util.Scanner;

class Problem9{
    public static void main(String[]args){
        //Creating the new input by using new Scanner and store in the input//
        
        Scanner input = new Scanner (System.in);
        //Taking the input for name, age, favorite food, height, weight, favorite toy of the dog, and theowner's name;//
        
        System.out.print("Enter the name of the dog: ");
        String name = input.nextLine();
        
        System.out.print("Enter its favorite food: ");
        String food = input.nextLine();

        System.out.print("Enter its age: ");
        int age = input.nextInt();
        
        System.out.print("Enter its height in cm: ");
        double tall = input.nextDouble();
        
        System.out.print("Enter its weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("What is its favorite toy: ");
        String toy = input.next();
        
        System.out.print("What is the name of the owner: ");
        String ownName = input.next();
        
            }
}
