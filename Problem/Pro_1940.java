import java.util.Scanner;

public class Pro_1940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n;
		int cmd,len;
		int speed,distance;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			
			speed = 0;
			distance = 0;
			for(int j=0; j<n; j++)
			{
				cmd=in.nextInt();
				
				len = 0;
				if(cmd != 0)
					len=in.nextInt();
				
				
				if(cmd == 1)
				{
					speed += len;
				}
				else if( cmd == 2)
				{
					speed -= len;
					if(speed < 0)
						speed = 0;
				}
						
				distance += speed;
				
			}
			
			
			System.out.println("#"+i+" "+distance);
			
		}
		
		
		
	}

}
