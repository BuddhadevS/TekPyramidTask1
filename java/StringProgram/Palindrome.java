package StringProgram;

public class Palindrome {
	public static void main(String[] args) {
		String s = "madam";
		String s2 = "";
		for(int i=s.length()-1;i>=0; i--) {
			s2  =s2+s.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
	}

}
