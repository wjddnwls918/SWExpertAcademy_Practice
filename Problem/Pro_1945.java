import java.util.Scanner;

public class Pro_1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n;
		int num[] = {2,3,5,7,11};
		int cntmap[];
		for(int i=1; i<=t; i++)
		{
			n=in.nextInt();
			
			cntmap = new int[12];			
	
			while(n != 1)
			{
			
				for(int j=0; j<num.length; j++)
				{
					if( (n % num[j]) == 0)
					{
						n /= num[j];
									
						cntmap[num[j]] += 1;
						break;
					}					
					else 
						continue;
				
				}			
			
			}
			
			System.out.println("#"+i+" "+cntmap[2]+" "+cntmap[3]+" "+cntmap[5]+" "+cntmap[7]+" "+cntmap[11]);
			
		}
		
	}

}

//실행시간, 메모리, 코드길이 다 괜찮은듯 
