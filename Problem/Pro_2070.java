import java.util.Scanner;

public class Pro_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		String result;
		for(int i=1; i<=t; i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			if(a==b)
				result = "=";
			else if( a>b)
				result = ">";
			else
				result = "<";
			System.out.println("#"+i+" "+result);
		}
	}

}
