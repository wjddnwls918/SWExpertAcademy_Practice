import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3131 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("2 3 5 ");
		isprime(6,1000000);
			
		
	}
	public static void isprime(long startNumber, long endNumber) {

		
		long modifiedNumber = 5;
		if (startNumber > 5 ) modifiedNumber = startNumber;
		

		for (long i = modifiedNumber; i<=endNumber; i++) {

			boolean priNum = true;

			if ((i%2==0)||(i%3==0)) priNum = false;

			else {

				for (int j=6; j<=(int)Math.sqrt(i)+1; j=j+6 ) {

					if ((i%(j-1)==0)||(i%(j+1)==0)) { priNum = false; break; }

				}

			}

			if (priNum==true) {

				System.out.print(i);
				if(i == endNumber)
					System.out.println();
				else
					System.out.print(" ");

			}

			
			
		}

	}




}
