import java.util.*;

public class Problem02{
	public static void main(String[]args){

		Random ran = new Random();

		String stars = "";
		//String total = "";
		for (int i = 0; i < 10; i++){
			stars = "";
			int x=1+ran.nextInt(20);

            System.out.print("number (" + x+"):");	
			for (int z=0; z < x; z++){
			     System.out.print("*");	
			}
			System.out.print("\n");	
			//total = total+x+stars;"\n";
		}
		//System.out.println("numbers: " + total);
	}
}