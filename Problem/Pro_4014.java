import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4014 {

		static int N,L;
	
		static int map[][];
		static int check[][];
		static int prev;
		static int result;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			L = Integer.parseInt(temp[1]);
			
			
			map = new int[N][N];
			
			
			for(int i=0; i<N; i++)
			{
				temp = in.readLine().split(" ");
				for(int j=0; j<N; j++)
				{
					map[i][j] = Integer.parseInt(temp[j]);
				}
			}
			
			result = 0;
			
			//탐색
			check = new int[N][N];
			//가로 
			boolean outflag;
			
			for(int i=0; i<N; i++)
			{
				outflag = false;
				for(int j=0; j<N; j++)
				{
					//System.out.println("check");
					if(j==0)
					{
						prev = map[i][j];
						continue;
					}
					
					
					
					//1차이보다 크면 건설불가
					if(map[i][j] > prev+1 || map[i][j] < prev-1)
					{
						check[i][j] = -1;					
						break;
					}
					
					//큰거
					if(map[i][j] == prev + 1)
					{
						
						//넘는경우
						if(j-L < 0 )
						{
							check[i][j] = -1;
							break;
						}
						
						//
						else {
							for(int k=j-1; k>=j-L; k--)
							{
								if(check[i][k] == 1)
								{
									check[i][k] = -1;
									outflag =true;
									break;
								}
								
								if(map[i][k] == prev)
									check[i][k] = 1;
															
								else
								{
									check[i][k] = -1;
									outflag = true;
									break;							
								}							
							}
						}
										
					}					
					
					//작은거 
					if(map[i][j] == prev -1)
					{
						if(j+L-1 >= N)
						{
							check[i][j] = -1;
							break;
						}
						else
						{
							for(int k=j; k<=j+L-1; k++)
							{
								if(check[i][k] == 1)
								{
									check[i][k] = -1;
									outflag =true;
									break;
								}
								if(map[i][k] == prev-1)
									check[i][k] = 1;				
								
								else
								{
									check[i][k] = -1;
									outflag = true;
									break;
								}
							}
						}
					}
					
					prev = map[i][j];
					
					if(outflag)
						break;						
				}				
			}
			
			
			boolean checkflag;
			for(int i=0; i<N; i++)
			{
				
				checkflag =true;
				for(int j=0; j<N; j++)
				{
					if(check[i][j] == -1)
					{
						checkflag = false;
						break;
					}						
				}
				
				if(checkflag == true)
					result++;
			}
			
	/*		for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					System.out.print(check[i][j]);
					if(j == N-1)
						System.out.println();
					else
						System.out.print("   ");
				}
			}
			
			System.out.println(result);*/
			
			//탐색
			check = new int[N][N];
			//세로		
			for(int j=0; j<N; j++)
			{
				outflag = false;
				for(int i=0; i<N; i++)
				{
					//System.out.println("check");
					if(i==0)
					{
						prev = map[i][j];
						continue;
					}
					
					
					
					//1차이보다 크면 건설불가
					if(map[i][j] > prev+1 || map[i][j] < prev-1)
					{
						check[i][j] = -1;					
						break;
					}
					
					//큰거
					if(map[i][j] == prev + 1)
					{
						
						//넘는경우
						if(i-L < 0 )
						{
							check[i][j] = -1;
							break;
						}
						
						//
						else {
							for(int k=i-1; k>=i-L; k--)
							{
								if(check[k][j] == 1)
								{
									check[k][j] = -1;
									outflag =true;
									break;
								}
								
								if(map[k][j] == prev)
									check[k][j] = 1;
								
								else
								{
									check[k][j] = -1;
									outflag = true;
									break;							
								}							
							}
						}
										
					}					
					
					//작은거 
					if(map[i][j] == prev -1)
					{
						if(i+L-1 >= N)
						{
							check[i][j] = -1;
							break;
						}
						else
						{
							for(int k=i; k<=i+L-1; k++)
							{
								if(check[k][j] == 1)
								{
									check[k][j] = -1;
									outflag =true;
									break;
								}
								
								if(map[k][j] == prev-1)
									check[k][j] = 1;
								
								else
								{
									check[k][j] = -1;
									outflag = true;
									break;
								}
							}
						}
					}
					
					prev = map[i][j];
					
					if(outflag)
						break;						
				}				
			}
		/*	
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					System.out.print(check[i][j]);
					if(j == N-1)
						System.out.println();
					else
						System.out.print("   ");
				}
			}*/
			
			for(int j=0; j<N; j++)
			{
				
				checkflag =true;
				for(int i=0; i<N; i++)
				{
					if(check[i][j] == -1)
					{
						checkflag = false;
						break;
					}						
				}
				
				if(checkflag == true)
					result++;
			}
			
			System.out.println("#"+x+ " " + result);
			
			
		}	
		
	}

}

//코드길이가 좀 긴데 
//실행시간, 메모리는 적음 
//
