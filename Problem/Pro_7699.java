import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Pro_7699 {

	static int R, C;

	static char map[][];

	static int max;

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };
	
	static boolean checkMap[][];
	static boolean checkAlpha[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {

			String input[] = in.readLine().split(" ");
			R = Integer.parseInt(input[0]);
			C = Integer.parseInt(input[1]);

			map = new char[R][C];

			for (int i = 0; i < R; i++) {
				String in2 = in.readLine();
				for (int j = 0; j < C; j++) {
					map[i][j] = in2.charAt(j);
				}
			}

			max = -1;
			checkMap = new boolean[R][C];
			checkAlpha = new boolean[26];
			
			checkMap[0][0] = true;
			checkAlpha[map[0][0] - 'A'] = true;
			findMax(0,0,1);

			System.out.println("#" + tc + " " + max);

		}

	}

	public static void findMax(int x, int y, int depth) {
		
		//중요 26이면 더 볼게 없기 때문에 재귀 리턴해줘야됨
		if(max == 26) return;
		if(max < depth) {
			max = depth;
		}
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny>=0 && nx <C && ny <R && !checkMap[ny][nx] && !checkAlpha[map[ny][nx]-'A']) {
				checkMap[ny][nx] = true;
				checkAlpha[map[ny][nx] -'A'] = true;
				findMax(nx,ny,depth+1);
				
				checkMap[ny][nx] = false;
				checkAlpha[map[ny][nx] -'A'] = false;				
			}
			
		}
		
		
	}


}
