import java.util.Scanner;

public class Pro_1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String str;
		int left,right;
		boolean flag;
		for(int i =1; i<=t; i++)
		{
			str = in.next();
			
			left =0;
			right = str.length()-1;
			flag = true;
			while(true)
			{
				if(left >= right)
					break;
				if(str.charAt(left) != str.charAt(right))
				{
					flag =false;
					break;
				}
				else
				{
					left ++;
					right --;
				}
			}
			
			if(flag)
				System.out.println("#"+i+" "+1);
			else
				System.out.println("#"+i+" "+0);
			
		}
	}

}
