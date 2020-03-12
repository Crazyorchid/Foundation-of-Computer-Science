import java.util.*;
public class Problem03{
	public static void main(String[]args){

		Random ran = new Random();
		int sum = 0;
		float mean = (float)sum/10;

		for (int i = 0; i < 10 ; i=i+1){
			int nxt = ran.nextInt(20);
			
			System.out.print("number (" + nxt + "): ");
			
			sum = sum + nxt;

			for (int z =0; z < nxt; z=z+1){
				System.out.print("*");

			}
			
			System.out.println("\n");


			

		}

}
}