package Sorting;

import java.util.*;

//These 3 codes could clear only 7 test cases out of 9.
public class ChanduAndHisGirlfriend {

	/*public static void swap(long A[],int i, int j){
		long temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static int partition(long A[],int beg,int end){
		int i=beg+1;
		for(int j=beg+1;j<=end;j++){
			if(A[j]>A[beg]){
				swap(A,i,j);
				i++;
			}
		}
		swap(A,beg,i-1);
		return i-1;
	}
	public static void quickSort(long A[],int beg,int end){
		if(beg<end){
			int pos = partition(A,beg,end);
			quickSort(A,beg,pos-1);
			quickSort(A,pos+1,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			long A[] = new long[N];
			for(int i=0;i<N;i++)
				A[i] = scan.nextLong();
			quickSort(A,0,N-1);
			for(int i=0;i<N;i++)
				System.out.print(A[i]+" ");
			System.out.println();
		}
		scan.close();
	}*/
	
	/*public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			ArrayList<Long> A = new ArrayList<Long>();
		
			for(int i=0;i<N;i++){
				A.add(scan.nextLong());
			}
			Collections.sort(A, new Comparator<Long>(){
				public int compare(Long i, Long j){
					if(i<j) return 1;
					if(i>j) return -1;
					return 0;
				}
			});
			for(int i=0;i<A.size();i++)
				System.out.print(A.get(i)+" ");
			System.out.println();
		}
		scan.close();
	}*/
	
	public static void swap(long A[],int i,int j){
		long temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			long A[] = new long[N];
		
			for(int i=0;i<N;i++){
				A[i] = scan.nextLong();
			}
			
			Arrays.sort(A);
			for(int i=0,j=N-1;i<N/2;i++,j--){
				swap(A,i,j);
			}
			
			for(int i=0;i<N;i++)
				System.out.print(A[i]+" ");
			System.out.println();
		}
		scan.close();
	}

}
