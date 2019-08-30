import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_2164 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(in.readLine());

		int i = 1;
		int resultParent, resultChild;

		while (true) {

			int left = (int) (Math.pow(i - 1, 2) + i - 1) / 2;
			int right = (int) (Math.pow(i, 2) + i) / 2;

			int gap = right - left;
			int count = X - left - 1;

			if (left < X && X <= right) {
				int parent, child;

				if (i % 2 == 0) {
					parent = 1;
					child = gap;

					resultParent = parent + 1 * count;
					resultChild = child - 1 * count;

				} else {

					parent = gap;
					child = 1;

					resultParent = parent - 1 * count;
					resultChild = child + 1 * count;
				}

				break;
			}
			++i;
		}

		System.out.println(resultParent + "/" + resultChild);

	}

}
