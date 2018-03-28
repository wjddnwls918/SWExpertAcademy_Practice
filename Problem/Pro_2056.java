import java.util.Scanner;

public class Pro_2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		String str;
		String strYear,strMonth,strDay;
		int dayinfo[] = { 31,28,31,30,31,30,31,31,30,31,30,31};
		int year,month,day;
		for(int i=1; i<=t; i++)
		{
			str=in.next();
			
			strYear = str.substring(0,4);
			strMonth =str.substring(4,6);
			strDay = str.substring(6,8);
			
			year = Integer.parseInt(str.substring(0,4));
			month = Integer.parseInt(str.substring(4,6));
			day = Integer.parseInt(str.substring(6,8));
					
			if(month >= 1 && month <=12)
			{
				if( day >=1 && day <= dayinfo[month-1])
				{
					System.out.println("#"+i+" "+strYear+"/"+strMonth+"/"+strDay);
				}
				else
				{
					System.out.println("#"+i+" "+-1);
				}
			}
			else
				System.out.println("#"+i+" "+-1);
			
			
		}
	}

}
