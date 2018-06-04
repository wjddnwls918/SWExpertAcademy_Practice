import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_1873 {
	
		//상하 좌우
		static int dx[] = {0, 0, -1, 1};
		static int dy[] = {-1, 1, 0, 0};

		static char map[][];
		static char cmd[];
		
		static int curx,cury,curdir;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		int H,W,N;
		String temp[];
		String tem;
	
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			H = Integer.parseInt(temp[0]);
			W = Integer.parseInt(temp[1]);
			
			
			map = new char[H][W];
			
			for(int i=0; i<H; i++)
			{
				tem = in.readLine();
				for(int j=0; j<W; j++)
				{
					map[i][j] = tem.charAt(j);
					if(map[i][j] == '<' || map[i][j] == '>' || map[i][j] == '^' || map[i][j] == 'v' )
					{
						curx = j;
						cury = i;
						if(map[i][j] == '^')
							curdir = 0;
						else if( map[i][j] == 'v')
							curdir = 1;
						else if( map[i][j] == '<')
							curdir = 2;
						else
							curdir = 3;
					}
					
				}
			}
			
			N = Integer.parseInt(in.readLine());
			cmd = new char[N];
			tem=in.readLine();
			for(int i=0; i<N; i++)
				cmd[i] = tem.charAt(i);
			
			
			int nextx,nexty;
			
			for(int i=0; i<N; i++)
			{
				if(cmd[i] == 'S')
				{
					nextx = curx + dx[curdir];
					nexty = cury + dy[curdir];
					
					while( true )
					{
						if(nextx >=0 && nextx <W && nexty >=0 && nexty <H)
						{
							if( map[nexty][nextx] == '*' )
							{
								map[nexty][nextx] = '.';
								break;
							}
							else if( map[nexty][nextx] == '#' )
							{
								break;
							}
						}
						else
							break;
						nextx += dx[curdir];
						nexty += dy[curdir];
					}
					
				}
				else if( cmd[i] == 'U')
				{
					curdir = 0;
					nextx = curx + dx[curdir];
					nexty = cury + dy[curdir];
					
					if(nextx >=0 && nextx <W && nexty >=0 && nexty <H && map[nexty][nextx] == '.')
					{
						map[cury][curx] = '.';
						if(curdir == 0)
						{
							map[nexty][nextx] = '^';
							curx = nextx;
							cury = nexty;
						}
						else if(curdir == 1)
						{
							map[nexty][nextx] = 'v';
							curx = nextx;
							cury = nexty;
						}
						else if( curdir == 2)
						{
							map[nexty][nextx] = '<';
							curx = nextx;
							cury = nexty;
						}
						else
						{
							map[nexty][nextx] = '>';
							curx = nextx;
							cury = nexty;
						}
					}
					else
					{
						if(curdir == 0)
						{
							map[cury][curx] = '^';							
						}
						else if(curdir == 1)
						{
							map[cury][curx] = 'v';						
						}
						else if( curdir == 2)
						{
							map[cury][curx] = '<';						
						}
						else
						{
							map[cury][curx] = '>';		
						}
					}
					
					
				}
				else if( cmd[i] == 'D')
				{
					curdir = 1;
					nextx = curx + dx[curdir];
					nexty = cury + dy[curdir];
					
					if(nextx >=0 && nextx <W && nexty >=0 && nexty <H && map[nexty][nextx] == '.')
					{
						map[cury][curx] = '.';
						if(curdir == 0)
						{
							map[nexty][nextx] = '^';
							curx = nextx;
							cury = nexty;
						}
						else if(curdir == 1)
						{
							map[nexty][nextx] = 'v';
							curx = nextx;
							cury = nexty;
						}
						else if( curdir == 2)
						{
							map[nexty][nextx] = '<';
							curx = nextx;
							cury = nexty;
						}
						else
						{
							map[nexty][nextx] = '>';
							curx = nextx;
							cury = nexty;
						}
					}
					else
					{
						if(curdir == 0)
						{
							map[cury][curx] = '^';							
						}
						else if(curdir == 1)
						{
							map[cury][curx] = 'v';						
						}
						else if( curdir == 2)
						{
							map[cury][curx] = '<';						
						}
						else
						{
							map[cury][curx] = '>';		
						}
					}
				}
				else if( cmd[i] == 'L')
				{
					curdir = 2;
					nextx = curx + dx[curdir];
					nexty = cury + dy[curdir];
					
					if(nextx >=0 && nextx <W && nexty >=0 && nexty <H && map[nexty][nextx] == '.')
					{
						map[cury][curx] = '.';
						if(curdir == 0)
						{
							map[nexty][nextx] = '^';
							curx = nextx;
							cury = nexty;
						}
						else if(curdir == 1)
						{
							map[nexty][nextx] = 'v';
							curx = nextx;
							cury = nexty;
						}
						else if( curdir == 2)
						{
							map[nexty][nextx] = '<';
							curx = nextx;
							cury = nexty;
						}
						else
						{
							map[nexty][nextx] = '>';
							curx = nextx;
							cury = nexty;
						}
					}
					else
					{
						if(curdir == 0)
						{
							map[cury][curx] = '^';							
						}
						else if(curdir == 1)
						{
							map[cury][curx] = 'v';						
						}
						else if( curdir == 2)
						{
							map[cury][curx] = '<';						
						}
						else
						{
							map[cury][curx] = '>';		
						}
					}
				}
				else if( cmd[i] == 'R')
				{
					curdir = 3;
					nextx = curx + dx[curdir];
					nexty = cury + dy[curdir];
					
					if(nextx >=0 && nextx <W && nexty >=0 && nexty <H && map[nexty][nextx] == '.')
					{
						map[cury][curx] = '.';
						if(curdir == 0)
						{
							map[nexty][nextx] = '^';
							curx = nextx;
							cury = nexty;
						}
						else if(curdir == 1)
						{
							map[nexty][nextx] = 'v';
							curx = nextx;
							cury = nexty;
						}
						else if( curdir == 2)
						{
							map[nexty][nextx] = '<';
							curx = nextx;
							cury = nexty;
						}
						else
						{
							map[nexty][nextx] = '>';
							curx = nextx;
							cury = nexty;
						}
					}
					else
					{
						if(curdir == 0)
						{
							map[cury][curx] = '^';							
						}
						else if(curdir == 1)
						{
							map[cury][curx] = 'v';						
						}
						else if( curdir == 2)
						{
							map[cury][curx] = '<';						
						}
						else
						{
							map[cury][curx] = '>';		
						}
					}
				}
			}//end of for
			
			System.out.print("#"+x+" ");
			for(int i=0; i<H; i++)
			{
				for(int j=0; j<W; j++)
				{
					System.out.print(map[i][j]);
					if(j==W-1)
						System.out.println();
				}
			}
			
		}//end of Testcase
	}

}

//슈퍼 하드코딩 
//상호의 배틀필드
