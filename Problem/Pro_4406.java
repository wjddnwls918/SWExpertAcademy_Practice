import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4406{

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		String str;
		for(int	x=1; x<=t; x++)
		{
			str = in.readLine();
			System.out.print("#"+x+" ");
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
			
		}
	}

}
