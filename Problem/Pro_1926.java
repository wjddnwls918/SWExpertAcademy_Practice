import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pro_1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt;
		
		for (int i=1; i<=n; i++)
		{
			cnt = 0;
			
			String temp = Integer.toString(i);
			for (int j =0; j < temp.length(); j++)
			{
				
				
				if( temp.charAt(j) == '3' ||
						temp.charAt(j) == '6'||
						temp.charAt(j) == '9'				
						)
				{
					cnt++;
				}				
					 
			}
			
			if( cnt > 0)
			{
				for(int k=0; k<cnt; k++)
				System.out.print("-");
			}
			else
			{
				System.out.print(temp);
			}
			
			
			if( i < n )
				System.out.print(" ");
		}
	}

}


//코드길이가 조금 긴데 이해하기 좋은듯 