import javafx.scene.input.ScrollEvent;
//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester: 1
// Year: 2020
// Practical Number: 4-part2
//===================================

public class Test {
    public static void main(String[] args) {
           int Disk = 9;
           HanoiTower hot = new HanoiTower();
           //Create the Tower of Hanoi Object
           hot.HoT(Disk, 'A', 'B', 'C');
           //call the method from the Hanoi Tower class with the project created above
    }
}
