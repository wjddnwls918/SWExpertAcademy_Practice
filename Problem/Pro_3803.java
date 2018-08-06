import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3803 {
	
   static int R, C, K;
   static long memo[][] = new long[2501][2501];


   public static long combination(int n, int r){
      if(n<=0)
         return 0;   
      
      return memo[n][r];

   }

//   public static long combination(int n, int r){
//      if(n<=0)
//         return 0;
//      
//      if(memo[n][r]>0)
//         return memo[n][r];
//      
//      if(r ==0 || n == r)
//         return memo[n][r] =1;
//      
//      return memo[n][r] = combination(n-1, r-1) + combination(n-1, r);
//   }
   
//   
//   public static long combination2(int n, int r){
//      if(n<=0)
//         return 0;
//      
//      if(r == 0 || n == r)
//         return 1;
//   
//      return combination(n-1, r-1) + combination(n-1, r);
//   }
   
//   public static long combination(int a, int b)
//   {
//      long up = 1;
//         long down = 1;
//
//         if (a <= 0)
//            return 0;
//
//         if (b == 0 || a == b)
//            return 1;
//
//         long n = a;
//         long r = b;
//
//         for (int i = 0; i < b; i++)
//         {
//            up = up * n;
//            down = down * r;
//            n--;
//            r--;
//         }
//
//         return up / down;
//   }
//   
   
   public static long allintersectionsOfTwoSet(){
      long tmp = combination((R - 2) * C, K) + 4 * combination((R - 1) * (C - 1), K) + combination(R * (C - 2), K);
      return tmp;
   }
   
   public static long allintersectionsOfoneSet() {
         long tmp = 2 * ( combination((R - 1) * C, K) + combination(R * (C - 1), K) );
         return tmp;
      }
      
   public static long allintersectionsOfThreeSet() {
         long tmp = 2 * ( combination((R - 2) * (C - 1), K) + combination((R - 1) * (C - 2), K) );
         return tmp;
      }
   
   public static long allintersectionOfFourSet(){
      long result = combination((R-2)*(C-2),K);
      return result;
   }
   
   public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      
      for(int i=0; i<=2500; i++){
            for(int j=0; j<= i; j++){
               if(i==j || j==0)
                  memo[i][j] = 1;
               else
                  memo[i][j] = (memo[i-1][j-1]% 1000000007 + memo[i-1][j]% 1000000007) % 1000000007;
            }
         }
      
      for(int i=0; i<T; i++){
         String[] temp = br.readLine().split(" ");
         
         R = Integer.parseInt(temp[0]);
         C = Integer.parseInt(temp[1]);
         K = Integer.parseInt(temp[2]);
         
        /* System.out.println(combination(R*C, K));
         System.out.println(allintersectionsOfoneSet());
         System.out.println(allintersectionsOfTwoSet());
         System.out.println(allintersectionsOfThreeSet());
         System.out.println(allintersectionOfFourSet());*/
         
         long result = combination(R*C, K)-(allintersectionsOfoneSet()-allintersectionsOfTwoSet()+allintersectionsOfThreeSet()-allintersectionOfFourSet());
         result %= 1000000007;
         
         
         
         System.out.println("#"+(i+1)+" "+result);
      }
         
         

      
      
   }

}