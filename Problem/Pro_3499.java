import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3499 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int N;		
		String str[];
		int midPnt;
		int interval;
		for(int x=1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			str = in.readLine().split(" ");
			
			
			if(N%2 == 1)
			{
				midPnt = N/2;
				interval = N/2 + 1;
			}
			else
			{
				midPnt = N/2 -1;
				interval = N/2;
			}
			
			//System.out.println(midPnt + " "+interval);
			
			System.out.print("#"+x+" ");
			for(int i=0; i<=midPnt; i++)
			{
				System.out.print(str[i]);
				if(N%2 == 1 && i+interval >= N)
					break;
				System.out.print(" ");
				System.out.print(str[i+interval]);
				if(i+N == N-1)
					System.out.println();
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
	}

}
