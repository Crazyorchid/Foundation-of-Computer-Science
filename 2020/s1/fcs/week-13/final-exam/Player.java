public class Player extends Person {
    int id = 0;
    static int playerIndex = 0;
    protected int numWins;
    protected int numPlayed;

    Player(String name, int age, int numWins, int numPlayed){
        super(name, age);
        this.numWins = numWins;
        this.numPlayed = numPlayed;
        playerIndex++;
        this.id = playerIndex;
    }

    public void win(){
        this.numWins++;
        this.numPlayed++;
    }

    public void lose(){
        this.numPlayed++;
    }

    //    get player's ranking score.
    public int getRanking(){
        int rankingScore = 0;
        if (this.numPlayed != 0){
            rankingScore = Math.round(this.numPlayed*(this.numWins/this.numPlayed));
        }

        return rankingScore;
    }

    //    Assessor
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String result = super.toString() + " ID " + this.id + " Ranking: " + getRanking();
        return result;
    }
}

