package Practice;

import java.util.*;
public class PrateekAndHisFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			long X = scan.nextLong();
			int value[] = new int[N];
			
			for(int i=0;i<N;i++)
				value[i] = scan.nextInt();
			
			long sum=0;
			boolean flag=false;			
			int i=0,j=0;
			
			while(i<N && j<N){
				while(j<N && sum<X){
					sum=sum+value[j++];
					//System.out.print(sum+" ");
				}
				while(i<N && sum>X){
					sum=sum-value[i++];
				}
					//System.out.print(sum+" ");
				if(sum==X){
					flag=true;
					break;
				}
				
			}
		
			
			if(flag==true)
				System.out.println("YES");
			else
				System.out.println("NO");
			}
		scan.close();
	}

}
