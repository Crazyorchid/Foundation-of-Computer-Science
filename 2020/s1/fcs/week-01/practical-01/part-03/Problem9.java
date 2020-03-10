import java.util.Scanner;

class Problem9{
    public static void main(String[]args){
        
        Scanner input = new Scanner (System.in);
        //name, age, favorite food, height, weight, favorite toy, and owner's name;//
        
        System.out.print("Enter the name of the dog: ");
        String name = input.nextLine();
        
        System.out.print("Enter its favorite food: ");
        String food = input.nextLine();

        System.out.print("Enter its age: ");
        int age = input.nextInt();
        
        System.out.print("Enter its height in cm: ");
        double tall = input.nextDouble();
        
        System.out.print("Enter its weight in kg: ");
        double height = input.nextDouble();
        
        System.out.print("What is its favorite toy: ");
        String toy = input.next();
        
        System.out.print("What is the name of the owner: ");
        String ownName = input.next();
        
            }
}