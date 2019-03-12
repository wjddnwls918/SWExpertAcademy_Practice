import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pro_5650 {
	
	static int N;
	static int map[][];
	static int check[][];
	
	//0, 왼 위 오른 아래
	static int dx[] = {0, -1, 0, 1, 0};
	static int dy[] = {0, 0, -1, 0, 1};
	
	static int cnt;
	static int max;
	
	static ArrayList<WormHole> pair[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			
			N = Integer.parseInt(in.readLine());
			String tem[];
			
			map = new int[N+2][N+2];
			
			pair = new ArrayList[5];
			for(int i=0; i<5; i++) {
				pair[i] = new ArrayList<>();
			}
			
			for(int i=0; i<N+2; i++) {				
				for(int j=0; j<N+2; j++) {
					if(i == 0 || j==0 || i == N+1 || j == N+1 ) {
						map[i][j] = 5;						
					}
				}
			}
			
			for(int i=1; i<N+1; i++) {
				tem = in.readLine().split(" ");
				for(int j=1; j<N+1; j++) {					
					
					map[i][j] = Integer.parseInt(tem[j-1]);	
					
					if(map[i][j] >=6 && map[i][j] <= 10) {
						pair[map[i][j]%6].add(new WormHole(j, i));						
					}
				}
			}		
		
			
			//연산 
			max = 0;			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					
									
					if(map[i][j] == 0)
					{	
						for(int k=1; k<=4; k++) {
							cnt = 0;	
							move(j,i,k);
							
						}
						
					}
				}
			}
			System.out.println("#"+ x+" "+ max);
		}
	}
	
	public static class WormHole{
		
		int x,y;
		
		public WormHole(int x, int y ) {
			this.x = x;
			this.y = y;
		}
	
	}
	
	
	public static void move(int startX, int startY, int startDir) {
		
		int x = startX;
		int y = startY;
		int dir = startDir;
		
		
		boolean outFlag = false;
				
		
		while(true) {			
			
			while(true) {				
				
				//System.out.println("x : " + x + " y : "+ y +" dir : "+ dir);
				
				
				
				x += dx[dir];
				y += dy[dir];
				
				//블랙홀이거나 시작위치
				if( (x == startX && y == startY) || map[y][x] == -1) {
					outFlag = true;
					break;
				}
				
				
				
				// 5이면
				if( map[y][x] == 5 ) {
					
					cnt++;
					
					dir = (dir+2) % 4;
					if(dir == 0)
						dir = 4;
					
					
					
					break;
					
				}
				
				//1 ~ 4 블럭
				if(map[y][x] >=1 && map[y][x] <=4) {
					
					//System.out.println(map[y][x]);
					cnt ++;
					
					int tem = map[y][x]-1;
					if(tem == 0)
						tem = 4;
					
					if(dir == map[y][x]) {
						dir = (dir+1) % 5;
						if(dir == 0)
							dir = 1;
						
						
					
						
						break;
						
					}else if( dir == tem ) {
						dir = (dir-1);
						if(dir == 0)
							dir = 4;
						
						
						break;
											
					}else {						
						dir = (dir+2) % 4;					
						if(dir == 0)
							dir = 4;
						
						break;
						
					}				
					
					
					
				}
				
				//웜홀
				boolean wormOut = false;
				if(map[y][x] >= 6 && map[y][x] <=10) {
					
					
						for(int i=0; i<2; i++) {
							
							
							if(pair[map[y][x]%6].get(i).x != x || pair[map[y][x]%6].get(i).y != y ) {
								
								int transX = pair[map[y][x]%6].get(i).x;
								int transY = pair[map[y][x]%6].get(i).y;
								
								x = transX;
								y = transY;								
								
								wormOut = true;
								break;
							}
						}
					
					
				}
				
				if(wormOut)
					break;
				
				
				
				
			}
			
			
			if(outFlag)
				break;
			
			
			
		}
		
		
		if(max < cnt) {
			max = cnt;
		}
	}

}
