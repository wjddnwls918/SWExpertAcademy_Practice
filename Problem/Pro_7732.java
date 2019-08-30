import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7732 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int x = 1; x <= T; x++) {
			String input, cmpInput;

			input = in.readLine();
			cmpInput = in.readLine();

			String date[] = input.split(":");
			String cmpDate[] = cmpInput.split(":");

			int dateInt[] = new int[3];
			int cmpDateInt[] = new int[3];

			for (int i = 0; i < 3; i++) {
				dateInt[i] = Integer.parseInt(date[i]);
				cmpDateInt[i] = Integer.parseInt(cmpDate[i]);
			}

			int hour, min, sec;

			int temp;
			temp = cmpDateInt[2] - dateInt[2];
			if (temp < 0) {
				temp += 60;

				cmpDateInt[1] -= 1;
			}
			sec = temp;

			temp = cmpDateInt[1] - dateInt[1];
			if (temp < 0) {
				temp += 60;
				cmpDateInt[0] -= 1;
			}
			min = temp;

			temp = cmpDateInt[0] - dateInt[0];
			if (temp < 0) {
				temp += 24;
			}
			hour = temp;

			String resultHour = "", resultMin = "", resultSec = "";

			if (hour < 10) {
				resultHour += "0";
				resultHour += hour;
			} else {
				resultHour += hour;
			}

			if (min < 10) {
				resultMin += "0";
				resultMin += min;
			} else {
				resultMin += min;
			}

			if (sec < 10) {
				resultSec += "0";
				resultSec += sec;
			} else {
				resultSec += sec;
			}

			System.out.println("#" + x + " " + resultHour + ":" + resultMin + ":" + resultSec);

		}
	}

}

//Á¤´ä
