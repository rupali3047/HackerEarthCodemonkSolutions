package Practice;

import java.util.*;
public class ChanduAndConsecutiveLetters {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
			String s = scan.next();
			char str[] = s.toCharArray(); 
			ArrayList<Character> str2 = new ArrayList<Character>();
			str2.add(str[0]);
			int i=0;
			for(i=0;i<str.length-1;){
				if(str[i]==str[i+1]){
					i++;
					continue; //Continue to parse till consecutive alphabets match
				}else{
					str2.add(str[++i]); //Arrange unique alphabets
				}
			}
			
			for(int k=0;k<str2.size();k++)
				System.out.print(str2.get(k));
			System.out.println();
		}
		scan.close();
	}
}
