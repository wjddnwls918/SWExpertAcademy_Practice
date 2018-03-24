import java.util.Scanner;

public class Pro_1231 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Pro_1231 ex = new Pro_1231();
		String n;
		int tem;
		String str[];
		String temp;		
		Node map[];
		
		for(int i=1; i<=10; i++)
		{
			n = in.nextLine();
			
			tem = Integer.parseInt(n);
									
			map = new Node[tem+1];
		
			for(int j=1; j<tem+1; j++)
			{
				map[j] = new Node();
			}
			
			int cnt=0;
			for(int j=1; j<=tem; j++)
			{
				
				temp = in.nextLine();		
				str = temp.split(" ");
				int nodeNum = Integer.parseInt(str[0]);
                int lineLength = str.length;
                 
                map[nodeNum].data = str[1];
                if(lineLength==3){
                	map[nodeNum].left = map[Integer.parseInt(str[2])];
                }else if(lineLength==4){
                	map[nodeNum].left = map[Integer.parseInt(str[2])];
                    map[nodeNum].right = map[Integer.parseInt(str[3])];
                }
				
			}
			
		
			System.out.println("#"+i);
			ex.inOrderPrint(map[1]);
			System.out.println();
		
			
		}
	}
		
	
	 public void inOrderPrint(Node node){
	        if(node.left != null){
	            inOrderPrint(node.left);
	        }
	        System.out.print(node);
	        if(node.right != null){
	            inOrderPrint(node.right);
	        }
	    }

}


class Node{
   String data;
   Node left;
   Node right;
    
   public String toString(){
       return String.valueOf(data);
   }
}



//알아둬야겠다
// 알고있었다가 까먹었음 