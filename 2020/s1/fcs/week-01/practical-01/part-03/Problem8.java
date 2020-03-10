import java.util.Scanner;

class Problem8{
    public static void main(String[]args){
        
        Scanner input = new Scanner (System.in);
        //name, age, favorite food, grade (in maths and English), height, weight and number of subject//
        
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
