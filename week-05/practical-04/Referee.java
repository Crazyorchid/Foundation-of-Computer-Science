public class Referee{
    public void judge() {
        Human human = new Human();
        Computer computer = new Computer();

        human.humanChoice();
        human.performMove(human.getChoice());
        computer.computerChoice();
        computer.performMove(computer.getChoice());


        if (human.getChoice().equalsIgnoreCase("rock") && computer.getChoice().equalsIgnoreCase("scissor")) {
            System.out.println("You won!");
        } else if (human.getChoice().equalsIgnoreCase("rock") && computer.getChoice().equalsIgnoreCase("paper")) {
            System.out.println("Computer won!");
        } else if ((human.getChoice().equalsIgnoreCase("rock") && computer.getChoice().equalsIgnoreCase("rock"))){
            System.out.println("It's a draw");
        }
            if (human.getChoice().equalsIgnoreCase("scissor") && computer.getChoice().equalsIgnoreCase("rock")) {
                System.out.println("Computer won!");
            } else if (human.getChoice().equalsIgnoreCase("scissor") && computer.getChoice().equalsIgnoreCase("paper")) {
                System.out.println("You won");
            } else if ((human.getChoice().equalsIgnoreCase("scissor") && computer.getChoice().equalsIgnoreCase("scissor"))){
                System.out.println("It's a draw");
            }
                if (human.getChoice().equalsIgnoreCase("paper") && computer.getChoice().equalsIgnoreCase("scissor")) {
                    System.out.println("Computer won");
                } else if ((human.getChoice().equalsIgnoreCase("paper") && computer.getChoice().equalsIgnoreCase("rock"))) {
                    System.out.println("You won");
                } else if ((human.getChoice().equalsIgnoreCase("paper") && computer.getChoice().equalsIgnoreCase("paper")))
                    System.out.println("It's a draw");
                }
            }