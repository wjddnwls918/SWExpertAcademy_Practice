import java.util.Arrays;
import java.util.Scanner;

public class Pro_1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int num[];
		int min,max,cnt;
		for(int i=1; i<=t; i++)
		{
			
			num = new int[10];
			 int total =0;
			for(int j=0; j<10; j++)
			{
				num[j] = in.nextInt();
				total +=num[j];
			}
			
			Arrays.sort(num);
	        max=num[9];
	        min=num[0];
	        total = total - max - min;
	             
	        System.out.println("#"+ i+" "+Math.round((double)total/8));
		}
	}

}
