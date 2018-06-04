import java.util.Arrays;
import java.util.Scanner;

public class Pro_3809 {
	
		static boolean checkflag;
		static int maxnum;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		int N;
		String arr;
		int check[];
		int temp[];
		for(int x=1; x<=T; x++)
		{
			N = in.nextInt();
			
			temp = new int[N];
			arr = "";
			for(int i=0; i<N; i++)
			{
				temp[i] = in.nextInt();
				arr += Integer.toString(temp[i]);
			}
					
					//System.out.println(arr);
			
			String tem;						
			for(int i =0; i<10000; i++)
			{
				tem = Integer.toString(i);
				check = new int[N];
				
				checkflag = false;
				for(int j=0; j<=N-tem.length(); j++)	
				{
					//System.out.println(tem + " "+ arr.substring(j,j+tem.length()));
					if(	tem.equals( arr.substring(j,j+tem.length())) )
					{
						checkflag = true;
						break;
					}					
				}				
				
				if(checkflag == false)
				{
					maxnum = i;
					break;
				}
			}
			
			System.out.println("#"+x+" "+maxnum);
			
		}
		
		
	}

}


//메모리, 실행시간, ㅗㅋ드길이 다기네 ..