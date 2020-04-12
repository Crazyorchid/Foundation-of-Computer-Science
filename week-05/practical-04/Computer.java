import java.util.Random;
public class Computer extends Player {
    public String computerChoice(){
        Random ran = new Random();
        int computerNum;
        computerNum = ran.nextInt(3);
        super.setChoice("");
        if (computerNum == 0){
            setChoice("rock");
        }
        else if (computerNum == 1){
            setChoice("scissor");
        }
        else if (computerNum == 2){
            setChoice("paper");
        }
        return getChoice();
    }

    @Override
    public void performMove(String choice) {
        System.out.println("Computer chose: " + this.getChoice());
    }
}
