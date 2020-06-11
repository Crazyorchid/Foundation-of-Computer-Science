/*==================================
Foundations of Computer Science
Student: Runtao Zhuge
id: a1778478
Semester: 1
Year: 2020
Practical Exam Number: Final
===================================*/
public class Player extends Person {
    protected int id = 0; //attributes
    protected int numWins;
    protected int numPlayed;
    static int playerIndex = 0;

    Player(String name, int age, int numWins, int numPlayed){
        super(name, age);
        this.numWins = numWins;
        this.numPlayed = numPlayed;
        playerIndex++;
        this.id = playerIndex;
    }

    public void win(){ //method win
        this.numWins++;
        this.numPlayed++;
    }

    public void lose() { //method lose
        this.numPlayed++;
    }

    public int getRanking(){
        int rankingScore = 0;
        if (this.numPlayed == 0){
            return rankingScore;
        }
        else {
            rankingScore = Math.round(this.numPlayed*(this.numWins/this.numPlayed));
            return rankingScore;
        }
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person: " + getName() + " is age: " + getAge() + " Id: " + getId() + " Ranking: " + getRanking();
    }




}


