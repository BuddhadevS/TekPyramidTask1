package Array_program;

public class Missing_Number_of_an_array {
	public static void main(String[] args) {
		int arr[]  = {1,2,3,4,5,7,8};
		int total_number = arr.length+1;
		int sum = 0;
		
		int original_number = total_number *(total_number+1)/2;
	
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		
		int missing_nuber = original_number-sum;
		System.out.println(missing_nuber);
		
	}

}
