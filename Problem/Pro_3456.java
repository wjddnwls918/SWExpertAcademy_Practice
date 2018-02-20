import java.util.Scanner;

public class Pro_3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n[] = new int[3];
		
		for(int j=1; j<=t; j++)
		{
			for(int i=0; i<3; i++)
				n[i]= in.nextInt();
			
			System.out.println("#"+j+" "+ (n[0]^n[1]^n[2]));			
		}	
		}

}
