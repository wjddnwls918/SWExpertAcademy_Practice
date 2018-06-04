import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Pro_4206 {

		static int N,M;
		static int map[][];
		static int temmap[][];
		static int check[][];
		static int isStay[][];
		
		static Queue<Info> que;
		
		static int dx[] = {0, 1, 0, -1 };
		static int dy[] = {-1, 0, 1, 0 };
		
		static int rememx,rememy;
		
		static boolean liveflag;
		static boolean isescape;
		
		static String result;
		static int time;
		
		static boolean ischeck;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			map = new int[N][M];			
			for(int i=0; i<N; i++)
			{
				temp = in.readLine().split(" ");
				for(int j=0; j<M; j++)
				{
					map[i][j] = Integer.parseInt(temp[j]);
					if(map[i][j] == 3)
						{
						rememx = j;
						rememy = i;
						}
				
				}
			}
			
			que = new LinkedList<>();
			que.add(new Info(rememx,rememy,0,map));
			
			time = 1;			
			
			Info tem;
			temmap = new int[N][M];
			isStay = new int[N][M];
			while(!que.isEmpty())
			{
				tem = que.poll();
				isStay[tem.y][tem.x] =  1;
				
				//번지는거 위해 check
				check = new int[N][M];
				//맵복사
				copymap(tem.nextmap,temmap);
				
				
				//퍼지게
				virus();
				
		/*		for(int i=0; i<N; i++)
				{				
					for(int j=0; j<M; j++)
					{
						System.out.print(temmap[i][j]);
						if(j == M-1)
							System.out.println();
						else
							System.out.print(" ");
					}
				}
				System.out.println();*/
				
				liveflag = false;
				isescape = false;
				
				escape(tem.x,tem.y,tem.time);
				//System.out.println(liveflag+" "+tem.y+" "+tem.x+" "+(tem.time+1));
				
				
				if(isescape)
				{
					result = Integer.toString(tem.time+1);
					break;
				}	
			/*	if(!liveflag)
				{
					
					continue;
				}*/
					
				ischeck =false;
				if(!liveflag /*&& temmap[tem.y][tem.x] ==0*/  )
				{
					int newx,newy;
					for(int i=0; i<4; i++)
					{
						newx = tem.x + dx[i];
						newy = tem.y + dy[i];
						if(temmap[newy][newx] == 2)
						{
							ischeck = true;
							/*result ="ZOMBIE";
							break;*/
						}
					}
					
					if(!ischeck)
						result = "CANNOT ESCAPE";
					//break;
				}
	
				
				time++;;
			}
			
			
			//System.out.println(isescape);
			if(ischeck && !isescape)
				result = "ZOMBIE";
			
			
			System.out.println("#"+x+" "+result);
		}
		
	}
	
	public static void virus()
	{
		int newx,newy;
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(temmap[i][j] == 2 && check[i][j] == 0)
				{
					check[i][j] = 1;
					for(int k=0; k<4; k++)
					{
						newx = j+dx[k];
						newy = i+dy[k];
						
						if(newx>=0 && newx <M && newy>=0 && newy<N && (temmap[newy][newx] == 0 || temmap[newy][newx]==3) && check[newy][newx] == 0)
						{
							
							check[newy][newx] = 1;
							temmap[newy][newx] = 2;							
						}
					}
				}
			}
		}
	}
	
	public static void escape(int x, int y,int time)
	{
		int newx,newy;
		for(int i=0; i<4; i++)
		{
			newx = x + dx[i];
			newy = y + dy[i];
			
			if(newx <0 || newx >=M || newy <0 || newy>=N)
			{
				isescape = true;
				break;				
			}
			
			if(newx>=0 && newx <M && newy>=0 && newy<N )
			{
				if(temmap[newy][newx] == 0 && isStay[newy][newx]!= 1)
				{
					temmap[y][x] = 0;
					//temmap[newy][newx] = 3;
					liveflag = true;
					que.add(new Info(newx,newy,time+1,temmap));
				}				
			}		
		}
		
	}
	
	static class Info{
		
		int x,y,time;
		int nextmap [][] = new int[N][M];		
		public Info(int x, int y,int time,int map[][])
		{
			this.x = x;
			this.y = y;
			this.time = time;
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				{
					nextmap[i][j] = map[i][j];
				}
			}
		}
		
	
		
	}
	
	static void copymap(int src[][], int dst[][])
	{
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				dst[i][j] = src[i][j];
			}
		}
	}

}


//문제가 노답인데 ?? 
//맞긴했는데 너무 어려움 