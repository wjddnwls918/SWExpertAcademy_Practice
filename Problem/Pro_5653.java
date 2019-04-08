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
	static int isNew[][];

	static Queue<Cell> que;

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
		
			for (int i = 0; i < K; i++) {

				startCell();

			}

			System.out.println("#" + x + " " + cntResult());

		}

	}

	public static int cntResult() {
		int result = 0;
		while (!que.isEmpty()) {
			Cell temp = que.poll();
			if (!temp.isDeath && temp.curTime < temp.life * 2)
				result += 1;
		}

		return result;
	}

	public static void startCell() {

		int curTime = 0;

		int size = que.size();
		isNew = new int[400][400];
		boolean isOk = false;

		for (int i = 0; i < size; i++) {
			Cell cur = que.poll();

			if (cur.isDeath) {				
				continue;
			}

			// 비활성화 상태일때

			if (!cur.activate) {

				if (cur.curTime < cur.life) {
					que.add(new Cell(cur.x, cur.y, cur.curTime + 1, cur.life, cur.activate, cur.isDeath));
				} else if (cur.curTime == cur.life) {
					// 활성화 시키기
					isOk = true;					
					que.add(new Cell(cur.x, cur.y, cur.curTime + 1, cur.life, true, cur.isDeath));
					cellProp(cur.x, cur.y, cur.life);
				}

			} else if (cur.activate) {

				if (cur.curTime >= cur.life * 2) {
					
				} else {
					// 활성화고 죽지않았으면
					que.add(new Cell(cur.x, cur.y, cur.curTime + 1, cur.life, cur.activate, cur.isDeath));
				}

			}

		}

		// 새로생긴 세포들 큐에 추가
		if (isOk)
			addCell();

	}

	public static void cellProp(int x, int y, int life) {

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if ((nx >= 0 && nx < 400 && ny >= 0 && ny < 400) && map[ny][nx] == 0) {

				if (isNew[ny][nx] == 0 || (isNew[ny][nx] != 0 && isNew[ny][nx] < life)) {
					// 아무것도 없는경우 , 있는데 새로 생긴경우
					isNew[ny][nx] = life;
				}

			}
		}

	}

	public static void addCell() {
		for (int i = 0; i < 400; i++) {
			for (int j = 0; j < 400; j++) {
				if (isNew[i][j] != 0) {
					map[i][j] = isNew[i][j];					
					que.add(new Cell(j, i, 0, isNew[i][j], false, false));
				}
			}
		}
		
	}

	public static void printTest() {
		for (int i = 170; i < 230; i++) {
			for (int j = 170; j < 230; j++) {
				System.out.print(map[i][j]);
				if (j == 229)
					System.out.println();
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
