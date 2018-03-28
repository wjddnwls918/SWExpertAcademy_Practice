import java.util.Scanner;

public class Pro_2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		for(int i=0; i<str.length(); i++)
		{
			System.out.print( (int)(str.charAt(i)-64) ); 
			if(i == str.length()-1)
				System.out.println();
			else
				System.out.print(" ");
		}		
	}

}
