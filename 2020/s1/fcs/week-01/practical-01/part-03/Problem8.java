/* Student name: Runtao Zhuge Student ID:a1778478
Problem 08*/
//importing the scanner
import java.util.Scanner;

class Problem8{
    public static void main(String[]args){
        //Setting up a new scanner to take inputs
        Scanner input = new Scanner (System.in);
        //Taking the input of name, age, favorite food, grade (in maths and English), height, weight and number of subject//
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your favorite food: ");
        String food = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your grade in math: ");
        double math = input.nextDouble();
        
        System.out.print("Enter your grade in English: ");
        double english = input.nextDouble();
        
        System.out.print("Enter your height in cm: ");
        double tall = input.nextDouble();
        
        System.out.print("Enter your weight in kg: ");
        double height = input.nextDouble();
        
        System.out.print("Enter your number of subject: ");
        int subjects = input.nextInt();
        
        
            }
}
