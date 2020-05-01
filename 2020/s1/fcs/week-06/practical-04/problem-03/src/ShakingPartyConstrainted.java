//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester: 1
// Year: 2020
// Practical Number: 4-part2
//===================================
import java.util.Random;

public class ShakingPartyConstrainted {

    public int nCouple;


        int nPeople;
        int ShakingParty() {
            Random random = new Random();
            /*setting random obj and generate random numbers*/

            int i = random.nextInt(10);
            //set i as the random number
            return i;
        }

        public int countHandShakes(int N) {
            //rules for handshakes
            if (N <= 1) {
                return 0;
            } else {
                return (N - 2) + countHandShakes(N - 1);
                //When only females can initiate the handshakes
                /*They shake hands with all other people except for herself and her partner, so the function should be (N-2) for each of it and the next round it
                lowers one number and keeps shaking hands with others except for their own partners*/
                //recursive functions
            }

        }

        public int getnCouple() {
            int num = ShakingParty();
            return num;
        }

        private int nCouple(){
            int num = ShakingParty();
            return num;

        }
        public void display() {
            int n = getnCouple();
            System.out.println("Number of people in the room: " + n*2);
            System.out.println("Number of couple in the room: " + n);
            System.out.println("Number of hands shake in the room: " + countHandShakes(n*2));
    }
}
