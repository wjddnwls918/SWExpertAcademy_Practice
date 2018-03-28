import java.util.Scanner;

public class Pro_1948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		int t = in.nextInt();
		int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		int m1,m2,d1,d2;
		int total;
		for(int i=1; i<=t; i++)
		{
			m1 = in.nextInt();
			d1 = in.nextInt();
			
			m2 = in.nextInt();
			d2 = in.nextInt();
			
			total = 0;
						
			
			if(m1!=m2)
			{
				total += (day[m1]-d1+1);
				for(int j=m1+1; j<=m2-1; j++)
				{
					total += day[j];
				}
				total += d2;
			}
			else
				total += (d2-d1+1);
			
			
			System.out.println("#"+i+" "+total);
		}
		
	}

}
