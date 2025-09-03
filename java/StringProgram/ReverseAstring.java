package StringProgram;

public class ReverseAstring {
	public static void main(String[] args) {
		String s = "buddhadev";
		String s2 = "";
		for(int i=s.length()-1; i>=0; i--) {
			s2 = s2 + s.charAt(i);
		}
		System.out.println(s2);
	}

}
