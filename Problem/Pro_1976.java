import java.util.Scanner;

public class Pro_1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int h1,m1,h2,m2;
		int resulth,resultm;
		for(int i=1; i<=t; i++)
		{
			h1=in.nextInt();
			m1 = in.nextInt();
			
			h2 = in.nextInt();
			m2 = in.nextInt();
			
			resulth = (h1+h2)%12;
			resultm = (m1+m2)%60;
			if( (m1+m2) / 60 == 1)
				resulth+=1;
			
			System.out.println("#"+i+" "+resulth+" "+resultm);
		}
	}

}
