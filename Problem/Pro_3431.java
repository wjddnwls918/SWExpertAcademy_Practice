import java.util.Scanner;

public class Pro_3431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int l,u,x;
		int result = -2;
		for(int i=1; i<=t; i++)
		{
			l = in.nextInt();
			u = in.nextInt();
			x = in.nextInt();
			
			if( x < l)
			{
				result = l -x ;
			}
			else if(x > l && x < u)
			{
				result = 0;
			}
			else
				result = -1;
			
			System.out.println("#"+i+" "+ result);
		
		}
	
	}

}
