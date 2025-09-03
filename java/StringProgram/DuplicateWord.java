package StringProgram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateWord {
	public static void main(String[] args) {
		String s = "java is a is";
		char[] c=s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<c.length; i++) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			else {
				int x=map.get(c[i]);
				x++;
				map.put(c[i], x);
			}
		}
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
