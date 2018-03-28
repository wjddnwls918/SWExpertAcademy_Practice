import java.util.Arrays;
import java.util.Scanner;

public class Pro_1983 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		int n,k;
		int mid[],fin[],sub[];
		double result[];
		double temp[];
		String score [] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		for(int i=1; i<=t; i++)
		{
			n=in.nextInt();
			k=in.nextInt();
			
			mid = new int[n];
			fin = new int[n];
			sub = new int[n];
			
			result = new double[n];
			temp = new double[n];
			
			for(int j=0; j<n; j++)
			{
				mid[j] = in.nextInt();
				fin[j] = in.nextInt();
				sub[j] = in.nextInt();
				
				result[j] = mid[j] * 0.35 + fin[j] *0.45 + sub[j] * 0.2;
				temp[j] = mid[j] * 0.35 + fin[j] *0.45 + sub[j] * 0.2;
				
			}
			double tmp;
			Arrays.sort(temp);
			//tmp = temp[k+1];
			for(int j=0; j<n; j++)
			{
				if(result[k-1] == temp[j])
				{
					//score 매기는거 이해 잘해야됨 
					System.out.println("#"+i+" "+score[(n-j-1)*10/n]);
					break;
				}
			}
			
			
		}
	}

}



