package Tek;

import java.util.Arrays;
import java.util.List;

public class TekString {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("aab","abc","bcd","ccde");
		
		List<String> result = list.stream()
                .filter(s -> s.chars().distinct().count() == s.length())
                .toList();
		
        System.out.println(result);
		
	}

}
