//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester: 1
// Year: 2020
// Practical Number: 4-part2
//===================================

public class HanoiTower {
    public static void HoT(int N, char start, char aux, char end){
        if (N == 1){
            //When there is only one disk is getting moved
            System.out.println("Disk 1 from " + start + " to " + end);
        }else{
            //When there is more than one disk in getting moved
            HoT(N-1, start, aux, end);
            //move the smaller disks to the last polar first, and mover the second to the auxiliary polar
            System.out.println("Disk " + N + " from " + start + " to " + end );
            //move the bottom one or ones to the last polar and move the smaller disks back to the top of the largest polar
            HoT(N-1, aux, start, end);
        }
    }
}
