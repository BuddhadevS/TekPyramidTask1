package Tek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) throws ClassNotFoundException{
		List<String> list =Arrays.asList("abc","baab","hello");
		//op--[1,2,0]
				
		 List<Integer> result = list.stream()
	                .map(s ->(int) s.chars()
	                                 .filter(c -> c == 'a')
	                                 .count()).toList(); 

	        System.out.println(result);


	        
	        
		
	        
		
	}

}
