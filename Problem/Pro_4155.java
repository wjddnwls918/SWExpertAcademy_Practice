import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_4155 {
	
		static int N,M;
		static char map[][];
		static Queue<Info> que;
		static int curx,cury;
		
		static int check[][];
		
		static int pone;
		static int curpone;
		
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static int result;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt( in.readLine() );
		String temp[];
		String tem;
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			map = new char[N][M];
			
			for(int i=0; i<N; i++)
			{
				tem = in.readLine();
				for(int j=0; j<M; j++)
				{
					map[i][j] = tem.charAt(j);		
					if(map[i][j] == '0')
					{
						curx = j;
						cury = i;
					}						
				}
			}
	
	
			pone = 0;
			que = new LinkedList<>();
			que.add(new Info(curx,cury,0,pone));
			Info cur;
		
			check = new int[N][M];
			result = 0;
			boolean outflag;				
			while(!que.isEmpty())
			{
				cur = que.poll();
				outflag = false;
			
				int newx,newy;		
				
				//System.out.println("cury : "+cur.y+" curx : "+cur.x + " cur.time : "+cur.time+ " cur.infopone : "+cur.infopone);
				for(int i=0; i<4; i++)
				{
					newx = cur.x+dx[i];
					newy = cur.y+dy[i];
										
					curpone = cur.infopone;
					
					if(newx>=0 && newx<M && newy>=0 && newy<N  && check[newy][newx] < 25 )
					{
						
						//빈곳						
						if(map[newy][newx] == '.' || map[newy][newx] == '0' || map[newy][newx] =='1')
						{						
							if(map[newy][newx] == '1')
							{
								outflag = true;
								result = cur.time+1;
								break;
							}
							que.add(new Info(newx,newy,cur.time+1,curpone));	
							check[newy][newx] +=1;
						}
						//소용돌이
						else if(map[newy][newx] == '#')
							continue;
				
						//포네
						else if(map[newy][newx] >='a' && map[newy][newx] <='f')
						{						
							curpone |= (1 <<(int)(map[newy][newx]-'a'));
							que.add(new Info(newx,newy,cur.time+1,curpone));
							check[newy][newx] +=1;
						}
						//포네읽어야 통과
						else if(map[newy][newx] >='A' && map[newy][newx] <='F')
						{							
							//System.out.println((curpone & 1<<(int)(map[newy][newx]-'A')));
							if( (curpone & 1<<(int)(map[newy][newx]-'A')) == 1<<map[newy][newx]-'A')
							{
							
								que.add(new Info(newx,newy,cur.time+1,curpone));
								check[newy][newx] +=1;
							}
						}						
						
					}					
					
				}
				
				if(outflag)
					break;
				
			}
			
			if(result == 0)
				result = -1;
			System.out.println("#"+x+" "+result);
			
		}
		
	}
	
	static class Info
	{
		int x,y,time;		
		int infopone;
		public Info(int x, int y, int time,int pone)
		{
			this.x = x;
			this.y = y;
			this.time = time;
			this.infopone = pone;		
			
		}
	}
	


}

//族 家 內
// ㅡㅡ 아오 