package Sorting;

import java.util.*;
public class ChanduAndHisGirlfriendReturns {
	
	//Passes 7 out of 9 test cases
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			int M = scan.nextInt();
			long A[] = new long[N];
			long B[] = new long[M];
			for(int i=0;i<N;i++)
				A[i]=scan.nextLong();
			for(int i=0;i<M;i++)
				B[i]=scan.nextLong();
			
			long comb[] = new long[N+M];
			int numComp = N+M;
			
			int i=0,j=0,p=0; //Merging of 2 arrays
			while(p<numComp){
				if(i>=N){   //If num of elements of first array exceeds
					while(j<M){
						comb[p++]=B[j++];
					}
				}
				else if(j>=M){ //If num elements of second array exceeds
					while(i<N){
						comb[p++]=A[i++];
					}
				}
				else if(A[i]>=B[j]){ //If first array element is greater
					comb[p++]=A[i++];
				}
				else if(B[j]>A[i]){ //If second array element is greater
					comb[p++]=B[j++];
				}
			}
			for(int t=0;t<N+M;t++)
				System.out.print(comb[t]+" ");
			System.out.println();
		}
		scan.close();
	}

}
