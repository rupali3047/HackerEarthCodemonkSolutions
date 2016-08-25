package Practice;

import java.util.*;
public class TerribleChandu {
	
	public static void swap(char str[],int i, int j){
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T-->0){
			String s = scan.next();
			char str[] = s.toCharArray();
			int i,j;
			for(i=0,j=(str.length-1);i<(str.length/2);i++,j--){
				swap(str,i,j);
			}
			System.out.println(str);
		}
		scan.close();
	}
	
}
