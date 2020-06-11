/*==================================
Foundations of Computer Science
Student: Runtao Zhuge
id: a1778478
Semester: 1
Year: 2020
Practical Exam Number: Final
===================================*/
import java.util.Stack;

public class Club{
    Player member;
    Stack<Player> Members =new Stack<Player>();



    public void addMember(Player member){
        Members.push(member);

    }

    public boolean removeMemberById(){
        Members.pop();
        return true;
    }

    public String printMembers(){
        return toString();

    }

    public String getHighestRankedPlayer(){
        return member;
    }

}
