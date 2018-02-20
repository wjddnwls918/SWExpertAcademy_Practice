import java.util.Scanner;

public class Pro_3314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
				
		
		for(int i=1; i<=5; i++)
		{
			int avg = 0;
			int temp = 0;
			for(int j=0; j<5; j++)
			{
				temp = in.nextInt();
				if( temp < 40)
					avg += 40;
				else 
					avg += temp;
			}
			
			
			System.out.println("#"+i+" "+ avg/5 );
			
		}
	}

}
