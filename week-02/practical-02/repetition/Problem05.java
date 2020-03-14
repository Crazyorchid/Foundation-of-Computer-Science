import java.util.Random;
public class Problem05{
	public static void main(String[]args){
		
		Random ran = new Random();
		int sum = 0;
		int mean = sum/10;
		

		for (int i=0;i<10; i++){
			int nxt = ran.nextInt(20);

			System.out.print("Number (" + nxt + "): ");

			sum = sum + nxt;
			mean = sum/10;

			for (int z = 0; z < nxt; z = z+1){
				switch (nxt){
					case 1: case 2: case 3: case 4: case 5:
					System.out.print("0");
					break;
					case 6: case 7: case 8: case 9: case 10:
					System.out.print("x");
					break;
					case 11: case 12: case 13: case 14: case 15:
					System.out.print("s");
					break;
					case 16: case 17: case 18: case 19: case 20:
					System.out.print("*");
					break;

				}
			}
			System.out.print("\n");
		}
		
	}	
}