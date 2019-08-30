import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Pro_6959 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {

			String num = in.readLine();

			Random ran = new Random();

			int turn = 0;
			
			while (num.length() != 1) {
				String temp = "";
				int pos = ran.nextInt(num.length() - 1);

				temp += num.substring(0, pos);

				int left, right;
				left = Integer.parseInt(num.charAt(pos) + "");
				right = Integer.parseInt(num.charAt(pos + 1) + "");

				temp += Integer.toString(left+right);
				
				if (pos + 2 < num.length()) {
					temp += num.substring(pos + 2, num.length());
				}
				
				
				
				turn += 1;
				turn %= 2;
				
				num = temp;

			}

			if(turn == 0) {
				System.out.println("#" + x + " B");
			} else {
				System.out.println("#" + x + " A");
			}
			
			
		}
	}

}
