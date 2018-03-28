import java.util.Scanner;

public class Pro_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		for(int i=1; i<=t; i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			
			System.out.println("#"+i+" "+a/b+" "+a%b);
		}
		
		
	}

}
