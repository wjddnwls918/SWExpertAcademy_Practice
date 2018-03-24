import java.util.Scanner;

public class Pro_1222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int result ,len;
		String str;		
		for(int i=1; i<=10; i++)
		{
			result =0;
			
			len = in.nextInt();
			
			str = in.next();
						
			
			for(int j=0; j<str.length(); j++)
			{
				if( str.charAt(j) <='9' && str.charAt(j) >='0') 
				{
					result += Integer.parseInt(""+str.charAt(j));
				}
			}
			
			System.out.println("#"+i+" "+ result);
		}
	}

}

//흠 ...
