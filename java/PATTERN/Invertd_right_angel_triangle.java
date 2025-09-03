package PATTERN;

public class Invertd_right_angel_triangle {
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,2,5,0,0,4,2};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0 && arr[j]!=0) {
					arr[i]= arr[i]+arr[j];
					arr[j]= arr[i]-arr[j];
					arr[i]= arr[i]-arr[j];
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
}}
