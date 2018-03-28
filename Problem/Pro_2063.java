import java.util.Arrays;
import java.util.Scanner;

public class Pro_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int num [] = new int[n];
		for(int i =0; i<num.length; i++)
		{
			num[i] = in.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[n/2]);
	}

}
