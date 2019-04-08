import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class Pro_5949 {

	static String strS[], strD[];
	static HashSet<String> set;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			String temp[] = in.readLine().split(" ");

			strS = new String[temp[0].length()];
			strD = new String[temp[1].length()];

			for (int i = 0; i < temp[0].length(); i++) {
				strS[i] = temp[0].charAt(i) + "";
				strD[i] = temp[1].charAt(i) + "";
			}

			set = new HashSet<>();
			
			System.out.println("#" + x + " " + matchStr());
		}
	}

	public static String transArrToStr(String str[]) {

		String result = "";

		for (int i = 0; i < str.length; i++) {
			result += str[i];
		}

		return result;
	}

	public static int matchStr() {

		Queue<Info> que = new ArrayDeque<>();

		que.add(new Info(transArrToStr(strS), 0));

		int result = 0;

		while (!que.isEmpty()) {
			Info temp = que.poll();

			if (temp.curStr.equals(strD)) {
				result = temp.cnt;
				break;
			}

			for (int i = 0; i < temp.curStr.length() - 1; i++) {
				
			}

		}

		return result;
	}

	public static void swapArr(int position) {
		
	}

	static class Info {
		String curStr;
		int cnt;

		public Info(String curStr, int cnt) {
			this.curStr = curStr;
			this.cnt = cnt;
		}

	}
}
