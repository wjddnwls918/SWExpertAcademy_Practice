import java.util.Scanner;

public class Pro_1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		String search,str;
		int cnt;
		char temp;
		boolean chkflag;
		for(int t=0; t<10; t++)
		{
			num = in.nextInt();
			
			search = in.next();
			str = in.next();
			
			cnt =0;
			
			temp = search.charAt(0);
			
			chkflag = true;
			
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i) == temp )
				{
					
					for(int j=0; j<search.length(); j++)
					{
						if(i+j > str.length()-1)
						{
							chkflag =false;
							break;
						}
						if(str.charAt(i+j)!= search.charAt(j))
						{							
							chkflag = false;
							break;
						}
					}
					
					if(chkflag == true)						
						cnt++;					
					else 
						chkflag = true;
				}
			}
			
			System.out.println("#"+num+" "+cnt);
			//System.out.println(search+" "+str);
		}
		
	}

}


//정답 인데 코드길이가 조금 길다