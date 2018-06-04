import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
public class Pro_2112 {
 
        static int D,W,K;
        static int map[][];
        static int temmap[][];
        static int temmap2[][];
     
        static boolean isok;
         
        static int cnum;
        static int lineflag;
      
        static boolean fin;
         
        static int result;
         
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        String temp[];
        for(int x=1; x<=T; x++)
        {
            temp = in.readLine().split(" ");
            D = Integer.parseInt(temp[0]);
            W = Integer.parseInt(temp[1]);
            K = Integer.parseInt(temp[2]);
             
            map = new int[D][W];
            temmap = new int[D][W];
            temmap2 = new int[D][W];
            
            for(int i=0; i<D; i++)
            {
                temp = in.readLine().split(" ");
                for(int j=0; j<W; j++)
                {
                    map[i][j] = Integer.parseInt(temp[j]);
                }
            }
             
            lineflag = 0;
            fin = false;
             
            solve();
             
            System.out.println("#"+x+" "+result);
        }
    }
     
    public static void solve()
    {
        //선택개수
        cnum = 1;
         
        boolean temp = success(map);
        //System.out.println(temp);
         
        if(temp == true)
        {
            result = 0;
            return;
        }
         
        while (true)
        {       
            if(cnum > D)
            	break;
            //줄선택 
            for(int i=0; i<D; i++)
            {
                if( (lineflag & (1<<i)) != (1<<i))
                {
                    lineflag |= (1<<i);
                    dfs(i,1);
                    lineflag &= ~(1<<i);
                }
            }
             
            if(fin)
            {
                result = cnum;
                break;
            }
             
            cnum++;
        }
    }
    public static boolean success(int map[][])
    {
        int cur;
        int cnt;
        isok = false;
        int okcnt=0;
        for(int i=0; i<W; i++)
        {
            for(int j=0; j<D; j++)
            {
             
                cnt = 0;
                cur = map[j][i];    
                for(int k=j; k<j+K; k++)
                {
                    if(k >= D)
                        break;
                    if(map[k][i] != cur)
                    {
                        j = k-1;
                        break;
                    }
                    else
                        cnt++;
                }
                 
                //한열 만족
                if(cnt == K)
                {
                 
                    okcnt++;
                    break;
                }
            }
        }
         
        //모두 만족하면 
        if(okcnt == W)
        {           
            return true;
        }
        //만족하지않으면
        else
        {
             
            return false;
        }
         
    }
     
    public static void dfs(int num,int depth)
    {
        if(depth == cnum)
        {
          
            //배열 복사
            copy(map,temmap);    
            copy(map,temmap2);
            
            for(int i=0; i<D; i++)
            {
                if( (lineflag & (1<<i)) == 1<<i)
                {
                   Arrays.fill(temmap[i], 1); 
                   Arrays.fill(temmap2[i], 0);
                }
            }        
 
            boolean temp = success(temmap);
            boolean temp2 = success(temmap2);
         
            //리얼 성공 
            if(temp || temp2)
                fin = true;
 
           
            return;
        }
        else
        {
        	if(fin)
        		return;
        	
            for(int i=num+1; i<D; i++)
            {
                if( (lineflag & (1<<i)) != (1<<i) )
                {
                    lineflag |= (1<<i);
                    dfs(i,depth+1);
                    lineflag &= ~(1<<i);
                }
            }
        }
         
         
    }
     
     
    public static void copy(int src[][], int dst[][])
    {
        for(int i=0; i<D; i++)
        {
            for(int j=0; j<W; j++)
            {
                dst[i][j] = src[i][j];
            }
        }
    }
 
}

//같은걸로 쫙칠해도 됬네 ;;

//실행시간 메모리 괜찮음
//근데 오래걸림 