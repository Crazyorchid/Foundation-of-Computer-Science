public class Player {
    private String choice;

    public void performMove(String choice) {
        System.out.println("Your Choice is:\n" + choice);
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

}


