import java.util.Scanner;


public class ArrayHandler {


	public static void main(String[] args) {
	
		int length = 20;
		String name[] = new String[length];
		int nD[] = new int[length];
		double variable1[]= new double[length];
		int tasteTot[] = new int[length];

		boolean access = true;
		
		for (int i = 0; i<length; ++i )
		{
			Scanner scan = new Scanner(System.in);
			name[i]=scan.next();
			nD[i]=scan.nextInt();
			variable1[i]=scan.nextDouble();
			tasteTot[i]=scan.nextInt();
			String tasteParam[] = new String[tasteTot[i]];
				for (int j = 0; j< tasteTot[i]; ++j) {
					tasteParam[i] = scan.next();
				}
				
				//rest of for loop variables
			}
			
	

	}

}
