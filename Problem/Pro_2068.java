import java.util.Scanner;

public class Pro_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		int num[];
		int max;
		for(int i=1; i<=t; i++)
		{
			num = new int[10];
			for(int j=0; j<10; j++)
				num[j] = in.nextInt();
			max = -1;
			
			for(int j=0; j<10; j++)
			{
				if(max < num[j])
					max = num[j];
			}
			System.out.println("#"+i+" "+max);
		}
	}

}
