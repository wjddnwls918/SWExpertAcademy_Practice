import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4223 {

		static int N;
	
		static int check;
		//static int check[];
		static String str = "SAMSUNG";
		static Info info[];
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			info = new Info[N];
			int len;
			String temp[];
			for(int i=0; i<N; i++)
			{
				info[i] = new Info();
				len = Integer.parseInt(in.readLine());
				temp = in.readLine().split(" ");
				for(int j=0; j<len; j++)
				{
					info[i].name+= temp[j];
				}
				info[i].P = Integer.parseInt(in.readLine()); 
			}
			
		/*	for(int i=0; i<N; i++)
			{
				System.out.println(info[i].name +" "+info[i].P);
				
			}*/
			
			//check = new int[N];
			check = 0;
			dfs(0);
			
			
		}
	}
	
	static class Info
	{
		String name;
		int P;
		public Info()
		{
			name = "";
			P = 0;
		}
		public Info(String name, int P)
		{
			this.name = name;
			this.P = P;
		}
	}
	
	public static void dfs(int depth)
	{
		if(depth == N)
		{
			System.out.println(check);
			/*for(int i=0; i<N; i++)
				System.out.print(check[i]);
			System.out.println();*/
			String tem[] = new String[N];
			for(int i=0; i<N; i++)
			{
				if( (check & (1<<i)) == (i<<i))
				{
					tem[i] = info[i].name;
				}
				else
					tem[i] = "";
			}
			
			boolean isok = true;
			for(int i=0; i<str.length(); i++){
				//if(tem[0]str.charAt(i))
			}
			
			return;
		}
		else
		{			
			//선택 x
			dfs(depth+1);
			//선택 
			
			check |= 1<<depth;
			dfs(depth+1);
			check &= ~(1<<depth);
			
			/*check[depth]=1;
			dfs(depth+1);
			check[depth]=0;*/
		}
	}
	
}
