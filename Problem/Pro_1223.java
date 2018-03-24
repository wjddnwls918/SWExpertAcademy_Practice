import java.util.Scanner;

public class Pro_1223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long result;
		int len;
		String str;
		long ch[];
	
		for(int i=1; i<=10; i++)
		{
			result =0;
			len = in.nextInt();
				
			ch = new long[len];
			
			str = in.next();
			
			//System.out.println(str);
			
			for(int j=0; j<len; j++)
			{
				if(str.charAt(j) == '+')
					ch[j] = '+';
				else if(str.charAt(j) == '*')
					ch[j] = '*';					
				else
					ch[j] = Integer.parseInt(""+str.charAt(j));
			}
			
			for(int j=0; j<ch.length; j++)
			{
				//이 조건문 때문에 오래걸렸다.
				// ch[j] 값이 연산자 *와 +의 아스키코드값과 일치해서 
				// j % 2 == 1 추가
					if((char)ch[j] == '*' && j % 2 == 1)
					{
						ch[j+1] = ch[j-1] * ch[j+1] ;
						ch[j-1] = 0;						
					}				
				
			}	
			
			for(int j=0; j<ch.length; j++)
			{					
				if( j%2 ==0)
				{
					result += ch[j];
				}				
				
			}				
			
			for(int j=0; j<ch.length; j++)
			{
				System.out.print(ch[j] +" ");
			}
			
			//77
			//5+4+9+9*9*2+6*6*5+9+3*5+5*7*8*3*7*1*9*9+8+3+8*9*6+2*9*3+6*5+6*7*2+5+5*3+4*6+7
			//5 477326
			
			//5 + 4 + 9 + 0  0  162  0  0  180  9  0  15  0  0  0  0  0  0  0  
			//476280 43 8 43 3 43 0 42 0 42 432 43 0 42 0 42 54 43 0 42 30 43 0 0 42 1764 2 43 5 43 0 42 15 43 0 42 24 43 7 #5 477286
			System.out.println("#"+i+" "+result);
		}
		
	}

}

//와 개오래걸림 ..
