import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_5644 {

		static int M,A;
		
		static int moveA[];
		static int moveB[];
		
		
	
		// 움x, 상 우 하 좌
		static int dx[] = {0, 0, 1, 0, -1};
		static int dy[] = {0, -1, 0, 1, 0};
		
		static int xOFA, yOFA;
		static int xOFB, yOFB;
		
		static int result;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tem[];
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
		
		tem = in.readLine().split(" ");
		
		M = Integer.parseInt(tem[0]);
		A = Integer.parseInt(tem[1]);
		
		moveA = new int[M];
		moveB = new int[M];
		
		tem = in.readLine().split(" ");
		for(int i=0; i<M; i++)
		{
			moveA[i] = Integer.parseInt(tem[i]);
		}
		tem = in.readLine().split(" ");
		for(int i=0; i<M; i++)
		{
			moveB[i] = Integer.parseInt(tem[i]);
		}
		
		
		BC bc[] = new BC[A];	
		for(int i=0; i<A; i++) {
			tem = in.readLine().split(" ");
			int temX = Integer.parseInt(tem[0]);
			int temY = Integer.parseInt(tem[1]);
			int temC = Integer.parseInt(tem[2]);
			int temP = Integer.parseInt(tem[3]);
			
			bc[i] = new BC(temX, temY, temC, temP);
		
			
		}

		xOFA = 1;
		yOFA = 1;
		
		xOFB = 10;
		yOFB = 10;
		
		
		result = 0;
		for(int i=0; i<=M; i++) {
			
			
			int max = 0;
			int sum;
			int check[];
			//한명이 각각 하나씩 선택
			for(int j=0; j<A; j++) {
				
				
						
				
				for(int k=0; k<A; k++) {
					sum = 0;
					check = new int[A];
					
					//두개다 만족
					if(bc[j].c >= (Math.abs(xOFA - bc[j].x)+Math.abs(yOFA - bc[j].y)) && bc[k].c >= (Math.abs(xOFB - bc[k].x)+Math.abs(yOFB - bc[k].y))) {
						
					//System.out.println("check1");
					
					check[j] +=1;
					check[k] +=1;
					
					if(check[j] == 2) {
						sum += 2 *( bc[j].p/2);
					}else if( check [k] == 2) {
						sum += 2 * ( bc[k].p/2);
					}else {
						
						sum += bc[j].p;
						sum += bc[k].p;
						
					}			
					
								
					
					}
					
					//a만 만족
					else if( bc[j].c >= (Math.abs(xOFA - bc[j].x)+Math.abs(yOFA - bc[j].y)) ) {
						
						//System.out.println("check1");
						
						sum += bc[j].p;
					
					}
					//b만 만족
					else if( bc[k].c >= (Math.abs(xOFB - bc[k].x)+Math.abs(yOFB - bc[k].y)) ) {
						
						//System.out.println("check1");
						
						sum += bc[k].p;
						
					}
					
					
					if(max < sum)
						max = sum;
					
				}				
			}
			
			//System.out.println(max);
			result += max;
			
			
			if(i >= M)
				break;
			
			xOFA += dx[moveA[i]];
			yOFA += dy[moveA[i]];
			xOFB += dx[moveB[i]];
			yOFB += dy[moveB[i]];
			
		}
		
		System.out.println("#"+x+" "+result);
		
		}
		
	}
	
	static class BC{
		int x,y;
		int c;
		int p;
		
		public BC(int x, int y, int c, int p) {
			
			this.x = x;
			this.y = y;
			this.c = c;
			this.p = p;		
			
		}
		
	}

}
