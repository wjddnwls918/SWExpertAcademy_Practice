import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Pro_2941 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		HashSet<String> set = new HashSet<>();

		set.add("c=");
		set.add("c-");
		set.add("dz=");
		set.add("d-");
		set.add("lj");
		set.add("nj");
		set.add("s=");
		set.add("z=");

		String input = in.readLine();

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (i + 2 <= input.length() && set.contains(input.substring(i, i + 2))) {
				i += 1;
			} else if (i + 3 <= input.length() && set.contains(input.substring(i, i + 3))) {
				i += 2;
			}

			count += 1;
		}

		System.out.println(count);

	}

}
