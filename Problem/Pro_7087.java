import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Pro_7087 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			int N = Integer.parseInt(in.readLine());
			String str;
			TreeSet<Character> set = new TreeSet<>();
			for (int i = 0; i < N; i++) {
				str = in.readLine();
				set.add(str.charAt(0));
			}

			int cnt = 0;
			Iterator<Character> itr = set.iterator();
			int curPos = 0;
			while (itr.hasNext()) {
				// System.out.println(itr.next());
				if (itr.next() - 'A' == curPos) {
					cnt += 1;
					curPos += 1;
				} else {
					break;
				}
			}

			System.out.println("#" + x + " " + cnt);
		}
	}

}

//Á¤´ä
