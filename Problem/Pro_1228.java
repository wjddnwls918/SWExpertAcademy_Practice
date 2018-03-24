import java.util.Scanner;

public class Pro_1228 {

		static int start,cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String n;
		String real;
		String numOp;
		String cmd;
		String realnum[];
		String cmdlist[];
		
		for(int i =1; i<=10; i++)
		{
			n = in.nextLine();						
			real = in.nextLine();		
			//System.out.println(real);
			
			realnum = new String[20];
			realnum = real.split(" ");		
			
			
			
			numOp = in.nextLine();		
			cmd = in.nextLine();			
				
			cmdlist = cmd.split(" ");			
			
			/*for(int j =0; j<realnum.length; j++)
				System.out.println(realnum[j]);
			*/
			for(int j = 0; j<cmdlist.length; j++)
			{
				//System.out.println(cmdlist[j]);
				
				if(cmdlist[j] == "I")
				{
					start = Integer.parseInt(cmdlist[j+1]);
					cnt = Integer.parseInt(cmdlist[j+2]);
				
					j = j+3;
					
					for(int k = start; k<start+cnt; k++)
					{
						realnum[k] = cmdlist[j];
						j++;
					}				
				
				}
				
				
			}
			
			

			System.out.println("#"+i);
			for(int j=0; j<10; j++)
			{
				System.out.print(realnum[j]);
				if(j == 9)
				{
					System.out.println();
				}
				else
					System.out.print(" ");
			}
			
		}
		
		
	}

}
