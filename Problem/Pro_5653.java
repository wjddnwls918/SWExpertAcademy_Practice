import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Pro_5653 {

	static int N, M, K;

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	static int map[][];

	static Queue<Cell> que;

	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		String tem[];
		for (int x = 1; x <= T; x++) {

			tem = in.readLine().split(" ");
			N = Integer.parseInt(tem[0]);
			M = Integer.parseInt(tem[1]);
			K = Integer.parseInt(tem[2]);

			map = new int[400][400];
			que = new ArrayDeque<>();
			for (int i = 200; i < 200 + N; i++) {
				tem = in.readLine().split(" ");
				int k = 0;
				for (int j = 200; j < 200 + M; j++) {
					if (!tem[k].equals("0")) {
						map[i][j] = Integer.parseInt(tem[k]);
						que.add(new Cell(j, i, 0, map[i][j], false, false));
					}
					k++;
				}
			}

			/*for(int i=200; i<200+N; i++) {
				for(int j=200; j<200+M; j++) {
					System.out.print(map[i][j]);
					if(j == 200+M-1)
						System.out.println();
					else
						System.out.print(" ");
				}
			}*/
			
			System.out.println(que.size());
			for (int i = 0; i < K; i++) {
				startCell();
			}

			result = 0;		

			System.out.println("#" + x + " " + result);

		}

	}

	public static void startCell() {

		int curTime = 0;

		int size = que.size();
		for (int i = 0; i < size; i++) {		
			System.out.println(size);
			Cell cur = que.poll();
			
			if(cur.curTime > K && !cur.isDeath)
				result ++;				

			
		}

	}

	public static void cellProp(int x, int y, int life) {

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if ((nx >= 0 && nx < 400 && ny >= 0 && ny < 400) && (map[ny][nx] == 0 || map[ny][nx] < life)) {
				System.out.println("check");
				map[ny][nx] =life;
				que.add(new Cell(nx, ny, 0, life, false, false));
			}
		}

	}

	public static class Cell {

		int x, y;
		int curTime;
		int life;
		boolean activate;
		boolean isDeath;

		public Cell(int x, int y, int curTime, int life, boolean activate, boolean isDeath) {
			this.x = x;
			this.y = y;
			this.curTime = curTime;
			this.life = life;
			this.activate = activate;
			this.isDeath = isDeath;
		}
	}

}
