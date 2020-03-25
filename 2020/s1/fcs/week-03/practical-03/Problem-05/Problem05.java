import java.util.Arrays;
import java.util.Scanner;
public class Problem05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Matrix Determinant Calculator");
		String a;
		System.out.println("Would you like to calculate the determinant of a new matrix? ");
		System.out.println("1. Yes 2.No: ");
		System.out.print("option: ");
		a  = input.next();
		while(a.equals("1")) {
			System.out.print("What is the demension of the matrix: ");
			int n = input.nextInt();
			int matrix [][] = new int [n][n];
			System.out.println("Great! Let's calculate the determinant then.");
			System.out.println("Please insert all the values for your matrix");
			
			for (int i=0;i<n;i++)
				for (int j=0; j<n; j++)
					matrix[i][j]=0;
			for (int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print("new matrix [" + (i+1)+ "]"+ "["+ (j+1)+"]");
					matrix[i][j] = input.nextInt();
					display(matrix);
				}
				
				System.out.println("Determinant: "+ determinant(matrix,n));
				
			}
			return;
			} 
			
		System.out.println("End of the program");	
		}
	
	public static int determinant(int A [][], int N) {
		int d =0;
		if(N==1) {
			d=A[0][0];
		}
		if(N==2) {
			d=A[0][0]*A[1][1]-A[1][0]*A[0][1]; //(ad - bc)
		}
		else {
			int[][]newMatrix = new int[N-1][];
			d =0;
			
			for(int column=0; column<N;column++)
			{
				for(int k = 0; k<(N-1);k++)
			{
				newMatrix[k] = new int[N-1];
			}
			
				for(int i=1; i<N;i++)
			{
				int row = 0;
				for(int j=0;j<N;j++)
				{
					if(j==column)
						continue;
					newMatrix[i-1][row]=A[i][j];
					row++;
				}
			}
			int deter;
			if(column%2 ==0) {
				deter = 1;
			}else {
				deter = -1;
			}
			d =deter * A[0][column] * determinant(newMatrix,N-1)+d;
			}	
		}
		return d;
		
	}
	
	static void display(int mat[][]) {
		for(int[]row : mat)
			System.out.println(Arrays.toString(row));
	}
}
