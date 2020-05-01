//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester: 1
// Year: 2020
// Practical Number: 4-part2
//===================================
import java.util.Random;

public class ShakingParty {
    int nPeople;
    int ShakingParty() {
        Random random = new Random();
        /*setting random obj and generate random numbers*/

        int i = random.nextInt(1000);
        //set i as the random number
        return i;
    }

    public int countHandShakes(int N) {
        //rules for handshakes
        if (N == 0) {
            return 0;
        } else {
            return (N - 1) + countHandShakes(N - 1);
        //recursive functions
        }

    }

    public int getnPeople() {
        int num = ShakingParty();
        return num;
    }

    private int nPeople(){
        int num = ShakingParty();
        return num;

    }
    public void display(){
        int n = getnPeople();
        System.out.println("Number of people in the room: " + n);
        System.out.println("Number of hands shake in the room: " + countHandShakes(n));
    }
}
