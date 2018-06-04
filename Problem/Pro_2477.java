import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_2477 {

		static int N,M,K,A,B;
		static int aj[],bj[],tk[];
		static int cura[],curb[];
		static int checkCusa[],checkCusb[];
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		String tem[];
		for(int x=1; x<=t; x++)
		{
			tem = in.readLine().split(" ");
			
			N = Integer.parseInt(tem[0]);
			M = Integer.parseInt(tem[1]);
			K = Integer.parseInt(tem[2]);
			A = Integer.parseInt(tem[3]);
			B = Integer.parseInt(tem[4]);
			
			aj = new int[N+1];
			bj = new int[M+1];
			tk = new int[K+1];			
			
			tem = in.readLine().split(" ");
			for(int i=1; i<=N; i++)			
				aj[i] = Integer.parseInt(tem[i-1]);		
			
			tem = in.readLine().split(" ");			
			for(int i=1; i<=M; i++)			
				bj[i] = Integer.parseInt(tem[i-1]);		
			
			tem = in.readLine().split(" ");			
			for(int i=1; i<=K; i++)			
				tk[i] = Integer.parseInt(tem[i-1]);
						
			
			//int time = 0;
			int cnt;
			Queue<Integer> waitA = new LinkedList();
			Queue<Integer> waitB = new LinkedList();
			
			cura = new int[N+1];
			curb = new int[M+1];
			
			//최종 결과 
			checkCusa = new int[K+1];
			checkCusb = new int[K+1];
			
			int checkA[] = new int[N+1];
			int checkB[] = new int[N+1];
										
			for(int time=0; time<=5000; time++)
			{
				for(int i=1; i<=K; i++)
				{
					if(tk[i] == time)
					{
						//i번 고객 넣기
						waitA.add(i);
					}
				}
				
				//접수
				int temp=0;
				for(int i=1; i<=N; i++)
				{
					if(cura[i] == 0)
					{
						if(waitA.isEmpty())
							break;
						temp = waitA.poll();
						cura[i] = temp;
						checkA[i] = aj[i];
						if(i == A)
							checkCusa[cura[i]] = 1;
					}
				}
				
				for(int i=1; i<=M; i++) {
					if(curb[i] == 0)
					{
						if(waitB.isEmpty())
							break;
						temp = waitB.poll();
						curb[i] = temp;
						checkB[i] = bj[i];
						
						if(i == B)
							checkCusb[curb[i]] = 1;
					}
				}

				for(int i=1; i<=N; i++)
				{
					if(cura[i] != 0)
					{
						checkA[i] -= 1;
						if(checkA[i] == 0)
						{
							waitB.add(cura[i]);
							cura[i] = 0;
						}
					}
				}
			
				
				for(int i=1; i<=M; i++)
				{
					if(curb[i] != 0)
					{
						checkB[i] -= 1;
						if(checkB[i] == 0)
						{
							curb[i] = 0;
						}
					}
				}
			}
		
			int result = 0;	
			
			for(int i=1; i<=K; i++)
			{
				if(checkCusa[i] ==1 && checkCusb[i] == 1)
					result += i;
			}
			
			if (result == 0)
				result = -1;
			System.out.println("#"+x+" "+result);
		}
	}
	
	static class Info
	{
		int cusNum;
		int remainTime;
		
		
	}

}

//와 ... 했다 ... 대박 
//코드길이 괜찮 , 실행시간 김 그래도 평균인듯 메모리가 좀 크다 
