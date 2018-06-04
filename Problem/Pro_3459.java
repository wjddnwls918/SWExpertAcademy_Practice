import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_3459 {
	
	static Long N;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt( in.readLine());
	
		
		
		for(int x=1; x<=t; x++)
		{
			N = Long.parseLong( in.readLine());
	
			
			int i = 1;
			int who = 0;
			while (true)
			{
				System.out.println(i);
				
				if( i * 2 > N && i*2+1>N)
				{
					if(who == 0)
						System.out.println("Bob");
					else
						System.out.println("Alice");
					break;
				}
				
				who = (who+1) % 2;
				
				if( i * 2 +1 <= N)
				{
					i = i*2+1;				
					continue;
				}
				else if( i * 2 <= N)
				{
					i = i*2;					
					continue;
				}
				
			
				
			}
			
		}
		
	
	}

}
