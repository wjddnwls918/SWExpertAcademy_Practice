import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Pro_7701 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			int N = Integer.parseInt(in.readLine());
			StringBuilder out = new StringBuilder();

			PriorityQueue<Info> que = new PriorityQueue<>();

			for (int i = 0; i < N; i++) {
				String temp = in.readLine();
				que.add(new Info(temp));
			}

			HashSet<String> set = new LinkedHashSet();

			while (!que.isEmpty()) {
				set.add(que.poll().str);
			}

			Iterator<String> itr = set.iterator();
			while (itr.hasNext()) {
				out.append(itr.next());
				if (itr.hasNext()) {
					out.append("\n");
				}
			}

			System.out.println("#" + x);
			System.out.print(out);
		}
	}

	static class Info implements Comparable<Info> {
		String str;
		int len;

		public Info(String str) {
			this.str = str;
			this.len = str.length();
		}

		@Override
		public int compareTo(Info arg0) {
			// TODO Auto-generated method stub

			if (this.len > arg0.len) {
				return 1;
			} else if (this.len == arg0.len) {

				if (this.str.compareTo(arg0.str) > 0) {
					return 1;
				} else if (this.str.compareTo(arg0.str) == 0) {
					return 0;
				} else {
					return -1;
				}

			} else {
				return -1;
			}

		}

	}

}

//Á¤´ä