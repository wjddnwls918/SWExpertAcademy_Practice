import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_3074 {

		static int N,M;
		static int cnt;
		static int waittime[];
		
		static int desk[];
		static int isEm[];
		static Queue<Integer> wait;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			//심사대
			N = Integer.parseInt(temp[0]);
			//사람수
			M = Integer.parseInt(temp[1]);
			
			wait = new LinkedList<>();
			
			waittime = new int [N];
			desk = new int[N];
			isEm = new int[N];
			
			for(int i=0; i<N; i++)
			{
				waittime[i] = Integer.parseInt(in.readLine());
			}
			
		
			
			cnt = 0;
			int time = 0;
			while(true)
			{
				for(int i=0; i<N; i++)
				{
					if(isEm[i] == 0)
					{
						//사람 뽑고
						isEm[i] = 1;
						
						//대기시간 넣기
						desk[i] = waittime[i];
					}
				}
				
				for(int i=0; i<N; i++)
				{
					if(isEm[i] == 1)
					{
						desk[i] -= 1;
						if( desk[i] == 0)
						{
							cnt+=1;
							isEm[i] = 0;
						}
					}
				}
				++time;
				
				//System.out.println(cnt);
				if(cnt >= M)
					break;
				
				
				
			}
			
			System.out.println("#"+x+" "+time);
			
		}
		
		
	}

}
