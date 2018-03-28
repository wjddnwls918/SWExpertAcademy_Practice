import java.util.Scanner;

public class Pro_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result=0;
		for(int i =1; i<=n; i++)
			result+=i;
		System.out.println(result);
	}

}
