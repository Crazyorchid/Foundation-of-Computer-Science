public class Main {

	public static void main(String[] args) {
		double [] temps = new double []
						 {18.2, 19.5, 21.7, 25, 26.1, 22.9, 
						  27.7, 39.6, 27.2, 26.7, 26.6, 24.5, 
						  21.6, 25.6, 31.3, 36.5, 41.8, 45, 45.2, 
						  45, 24.7, 27.5, 34.7, 33.4, 35.7, 
						  35.4, 42.7, 40.1, 39.8, 41.5, 24.7};
				int count1 = 0; 
				int count2 = 0;
				int count3 = 0;
				int count4 = 0;
				int count5 = 0;
				
				for (int i =0; i < temps.length; i++) {
					if(temps[i]<= 10 ) {
						count1++;
						
					}
					if(10 <temps[i] && temps[i]<=20) {
						count2++;
						
					}
					if(20 <temps[i] && temps[i]<=30) {
						count3++;
					}
					if(30 <temps[i] && temps[i]<=40) {
						count4++;
					}
					if(40 <temps[i] && temps[i]<=50) {
						count5++;
					}
					
					}
				System.out.println("Number of days 0-10 degrees: " + count1);
				System.out.println("Number of days 11-20 degrees: "+ count2);
				System.out.println("Number of days 21-30 degrees: " + count3);
				System.out.println("Number of days 31-40 degrees: "+ count4);
				System.out.println("Number of days 41-50 degrees: " + count5);
				
			System.out.print("\n");
		}
		
	
}



