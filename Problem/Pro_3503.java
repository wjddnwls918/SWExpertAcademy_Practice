import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pro_3503 {

		static int N;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];		
		for(int x=1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			temp = in.readLine().split(" ");
			int num[] = new int[N];
			for(int i=0; i<N; i++)
			{
				num[i] = Integer.parseInt(temp[i]);
			}
		/*	for(int i=0; i<N; i++)
			{
				System.out.println(num[i]);
			}
			System.out.println();*/
			
			Arrays.sort(num);
			
			int left = num[0];
			int right = num[N-1];
			int tem;
			for(int i=1; i<N; i++)
			{
				if(left < num[i])
				{
					tem = num[i];
					num[i] = left;
					num[0] = tem;
					break;
				}
				
			}
			for(int i=N-2; i>=0; i--)
			{
				if(right > num[i])
				{
					tem = num[i];
					num[i] = right;
					num[N-1] = tem;
					break;
				}
			}
			
		/*	for(int i=0; i<N; i++)
			{
				System.out.println(num[i]);
			}*/
			
			int max = -1;
			if( max < Math.abs(num[0]-num[N-1]));
				max = Math.abs(num[0]-num[N-1]);
			
			for(int i=0; i<N-1; i++)
			{
				
				if(max < Math.abs(num[i]-num[i+1]))
				{
					max = Math.abs(num[i]-num[i+1]);
				}
				
			}
			
			System.out.println("#"+x+" "+max);
		}
		
	}

}
