import java.util.Scanner;

public class Human extends Player{
    public String humanChoice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please make a choice: 1.rock 2.scissor 3.paper");
        setChoice(in.nextLine());
        return getChoice();
    }

    @Override
    public void performMove(String choice) {
        System.out.println("You chose: " + this.getChoice());
    }
}
