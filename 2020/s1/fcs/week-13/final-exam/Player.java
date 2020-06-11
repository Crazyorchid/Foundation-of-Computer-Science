public class Player extends Person {
    private int id;
    private int numWins;
    private int numPlayed;

    public Player(String name, int age, int numWins, int numPlayed) {
        super(age, name);
        //this.id = id;
        this.numWins = numWins;
        this.numPlayed = numPlayed;
    }
    public void win(){
        if (numWins>numPlayed){
            throw new UnsupportedOperationException("Impossible to find the number");
        }else {
            System.out.println(numWins);
        }

    }
    public void lose(){
        if (numWins>numPlayed) {
            throw new UnsupportedOperationException("Impossible to find the number");
        }else {
            System.out.println(numPlayed - numWins);
        }
    }



    public int getRanking(){
        if (numPlayed == 0){
            return 0;
        }
        else {
            return numPlayed * (numWins / numPlayed);
        }



    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person: " + getName() + " is age:" + getAge() + " Id: " + id + " Ranking:" + getRanking();
    }
}
