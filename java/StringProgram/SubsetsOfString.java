package StringProgram;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfString {

    public static void main(String[] args) {
		String s= "java";
		List<String> list = new ArrayList<String>();
		for(int i=0; i<=s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				list.add(s.substring(i,j));
			}
		}
		System.out.println(list);
	}
}
