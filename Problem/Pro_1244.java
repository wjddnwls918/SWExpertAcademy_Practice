import java.util.Arrays;
import java.util.Scanner;

public class Pro_1244 {

	
		static int cnt;
		static int temp[];
		static String num;
		static int max;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t= in.nextInt();
		
		
		for(int i=1; i<=t; i++)
		{
			max = -1;
			num = in.next();
			cnt = in.nextInt();
			
			temp = new int[num.length()];
			
			
			for(int j=0; j < num.length(); j++)
			{
				temp[j] = Integer.parseInt(num.charAt(j)+"");
			}
			
			for(int j=0; j<num.length()-1; j++)
			{
				for(int k=j+1; k<num.length(); k++)
				{					
					if(temp[j] >= temp[k])
						continue;
					else
						findMax(j,k,1);
				}
			}
			
			//findMax(0,1,1);
			
			System.out.println("#"+i+" "+max);
		}
		
	}
	
	
	public static void findMax(int left, int right, int depth)
	{
		int swap;
		swap = temp[right];
		temp[right] = temp[left];
		temp[left] = swap;
		
		int result = 0;
		
		if(depth == cnt)
		{
			for(int i =0; i<temp.length; i++)
			{
				result +=  temp[i]*(int)Math.pow(10, (temp.length-i-1)) ; 
			}
			
			if (max < result)
			{
				max = result;
			}
			
		}
		else
		{
			for(int j=0; j<num.length()-1; j++)
			{
				for(int k=j+1; k<num.length(); k++)
				{	
					if(temp[j] > temp[k])
						continue;
					else
					findMax(j,k,depth+1);
				}
			}
			
			
			
		}
		
		swap = temp[right];
		temp[right] = temp[left];
		temp[left] = swap;
		
	}
	

	static class info
	{
		
	}
	
}

//시간 초과 잡아야됨 

//이건 bfs 문제다  각 홉마다 해서