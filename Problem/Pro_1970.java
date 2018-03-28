import java.awt.print.Printable;
import java.util.Scanner;

public class Pro_1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		int n;
		int div[] = {50000,10000,5000,1000,500,100,50,10};
		int coinCnt[];
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			
			coinCnt = new int[8];
			
			for(int j=0; j<div.length; j++)
			{
				if(  n>= div[j])
				{
					coinCnt[j] = (int)n/div[j];
					n = n % div[j];
				}
			}
			
			System.out.println("#"+i);
			for(int j=0; j<coinCnt.length; j++)
			{
				System.out.print(coinCnt[j]);
				if(j == coinCnt.length-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

}
