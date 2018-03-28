import java.util.Scanner;

public class Pro_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int sum = 0;
		for(int i=0; i<str.length(); i++)
			sum += Integer.parseInt(str.charAt(i)+"");
		System.out.println(sum);
	}

}
