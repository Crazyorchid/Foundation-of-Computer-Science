//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester: 1
// Year: 2020
// Practical Number: 4-part2
//===================================

public class countHandShakes {
    //the method for count hand shakes, which is also included in the ShakingParty class
    public int countHandShakes(int N) {
        if (N == 0) {
            return 0;
        } else {
            return (N - 1) + countHandShakes(N - 1);


        }
    }
}
        //public void displayHS(){
        //System.out.println("Number of people in the room: " + );

