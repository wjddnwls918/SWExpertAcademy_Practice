import java.util.Base64;
import java.util.Scanner;

public class Pro_1491 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i =1; i<=t; i++)
		{
			String decod = in.next();
			try {
				decod = new String(Base64.getDecoder().decode(decod),"utf-8");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("#"+i+" "+decod);
		}
	}

}

//이런것도 있구나 
//근데 라이브러리 안쓰고 어떻게 풀려나 