package Sorting;

import java.util.*;
//It clears 5 test cases out of 7
public class PuchiAndLuggage {

	public static int binSearch(int arr[], int ele,int beg,int end){
		int mid = (beg+end)/2;
		if(arr[mid]==ele)
			return mid;
		else if(ele < arr[mid])
			return binSearch(arr,ele,beg,mid-1);
		else
			return binSearch(arr,ele,mid+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
			int N = scan.nextInt();
			int weight[] = new int[N]; //Original array of weights
			int sortWeight[] = new int[N]; //Sorted array of weights
			boolean visited[] = new boolean[N]; //Notifies which positions are visited
			for(int i=0;i<N;i++)
				visited[i]=false;
			
			for(int i=0;i<N;i++)
				weight[i] = scan.nextInt();
			sortWeight = weight.clone();
			Arrays.sort(sortWeight);
			
			for(int i=0;i<N;i++){
				int element = weight[i];
				int indSorted = binSearch(sortWeight,element,0,N-1);
				
				int count=0;
				visited[indSorted]=true;
				for(int j=0;j<indSorted;j++){
					if(visited[j]==false){
						count++;
					}
				}
				System.out.print(count+" ");
			}
			System.out.println();
			
		}
		scan.close();
	}

}
