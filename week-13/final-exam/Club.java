/*==================================
Foundations of Computer Science
Student: Runtao Zhuge
id: a1778478
Semester: 1
Year: 2020
Practical Exam Number: Final
===================================*/
import java.util.Stack;

public class Club extends Player{
    Player member;
    Stack<Player> Members =new Stack<Player>();

    Club(String name, int age, int numWins, int numPlayed) {
        super(name, age, numWins, numPlayed);
    }

    public void addMember(Player member){
        Members.push(member);

    }

    public int removeMemberById(){
        Members.pop();

        return getId();

    }

    public String printMembers(){
        return toString();

    }

}
