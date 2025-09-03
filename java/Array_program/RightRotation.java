package Array_program;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 7};

        int last = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) {
        	arr[i] = arr[i-1];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
