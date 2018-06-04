import java.util.Arrays;
import java.util.Scanner;

public class Pro_2115 {
	
		static int N,M,C;
		
		//벌통
		static int map[][];
		static int trans[];
		static int check[];
		static int index[];
		static int cnt;
		
		//두사람
		static int A[],B[];
		
		//결과
		static int result;
		static int aresult;
		static int bresult;
		//
		static int ans;
		static int checka[];
		static int checkb[];
		static int mapa[];
		static int mapb[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		for(int i=1; i<=t; i++)
		{
			N = in.nextInt();
			M = in.nextInt();
			C = in.nextInt();
			
			map = new int[N][N];		
			trans = new int[N*N];
			
			
			int l=0;
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					map[j][k] = in.nextInt();
					trans[l] = map[j][k];
					l++;
				}
			}
		
			result = -1;
			for(int j=0; j< ( (N*N)-(2*M)+1); j++)
			{
				//System.out.println(j);
				check = new int[N*N];
				A = new int[M];
				
				int m=0;
				for(int k=j; k<j+M; k++)
				{					
					if(k%N == N-1 && m !=M-1)
						break;
						A[m]=k;
						m++;		

						
				}
				
				
				//A완성
				if(m == M)
				{
					
					
					
					for(int o=A[M-1]+1; o < (N*N)-M+1; o++)
					{
						B = new int[M];
						
						int p = 0;
						for(int q=o; q<o+M; q++)
						{
							if( q%N == N-1 && p != M-1)
							{
								p=0;
								continue;
							}
							else
							{
								B[p] = q;
								p++;
								
								//B완성
								if(p == M)
								{
									/*for(int n=0; n<A.length; n++)
									{
										System.out.print(A[n]);
										
									}
									
									
									for(int n=0; n<B.length; n++)
									{
										System.out.print(B[n]);
										if(n== B.length-1)
											System.out.println();									
									}*/
									
									int atotal=0;
									int btotal=0;
									
									//합계산
									for(int n=0; n<M; n++)
									{
										atotal += trans[A[n]];
										btotal += trans[B[n]];
									}
									
									aresult=0;
									bresult=0;
									int temp=0;
									int index=M-1;
									int tem[] = new int[M];
									for(int n=0; n<M; n++)
										tem[n] = trans[A[n]];
									//C초과 계산
									if(atotal > C)
									{
										checka = new int[M];
										mapa = new int[M];
										
										Arrays.sort(tem);	
										
										findamax(tem,0,0);
							
										
									}
									else
									{
										for(int n=0; n<M; n++)
										{
											aresult+= Math.pow(tem[n], 2);
										}
									}
									
									temp=0;
									index=M-1;
									for(int n=0; n<M; n++)
										tem[n] = trans[B[n]];
									if(btotal > C)
									{
										checkb = new int[M];
										mapb = new int[M];
										
										Arrays.sort(tem);
										
										findbmax(tem,0,0);
									
									}
									else {
										for(int n=0; n<M; n++)
										{
											bresult+= Math.pow(tem[n], 2);
										}
									}
								
									
									if( result < aresult+bresult)
										result = aresult+bresult;
								}
								
							}
						
						}
						
						
					}
					
				}
				
				
			}
		
			
			System.out.println("#"+i+" "+result);
			
		}//end of testcase
		
		
	}
	
	public static void findamax(int temp[],int depth,int sum)
	{
		
			int tem = 0;
			for(int i=0; i<mapa.length; i++)
			{
				tem += Math.pow(mapa[i],2);
			}
			
			if(aresult < tem)
				aresult = tem;
			
			
			for(int i=0; i<temp.length; i++)
			{
				if( checka[i] != 1 && (sum + temp[i] <= C))
				{
					mapa[depth] = temp[i];
					checka[i] = 1;
					findamax(temp,depth+1,sum+temp[i]);
					checka[i] = 0;
					mapa[depth] = 0;
					
				}
			}
		
	}
	
	public static void findbmax(int temp[],int depth,int sum)
	{
		
			int tem = 0;		
			for(int i=0; i<mapb.length; i++)
			{
				tem += Math.pow(mapb[i],2);
			}
			
			if(bresult < tem)
				bresult = tem;
			
			
			for(int i=0; i<temp.length; i++)
			{
				if( checkb[i] != 1 && (sum + temp[i] <= C))
				{
					mapb[depth] = temp[i];
					checkb[i] = 1;
					findbmax(temp,depth+1,sum+temp[i]);
					checkb[i] = 0;
					mapb[depth] = 0;
					
				}
			}
		
	}
	
		
}



//너무 오래걸렸다 짜는데 
