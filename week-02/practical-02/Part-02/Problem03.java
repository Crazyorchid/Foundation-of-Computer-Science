import java.util.*;
public class Problem03{
	public static void main(String[]args){

		Random ran = new Random();
		int sum = 0;
		int mean = sum/10;
		
		for (int i = 0; i < 10 ; i=i+1){
			int nxt = ran.nextInt(20);
			
			System.out.print("Number (" + nxt + "): ");
			
			sum = sum + nxt;
			mean = sum/10;

			for (int z =0; z < nxt; z=z+1){
				System.out.print("*");
				

			}
			System.out.print("\n");
				
		}

			System.out.print("Average (" + mean + "): ");
			for (int x = 0; x < mean; x++){


			System.out.print("*");
		}
			System.out.print("\n");


			}
}
