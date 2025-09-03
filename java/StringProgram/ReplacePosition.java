package StringProgram;

import java.util.Scanner;

public class ReplacePosition {
    public static void main(String[] args) {
  
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the number ");
    	int first = Integer.MIN_VALUE;
    	
    	for(int i=0; i<5; i++) {
    		int no = s.nextInt();
    		
    		if(no>first) {
    			first = no;
    		}
    	}
    	System.out.println("The large element is "+first);
}}
