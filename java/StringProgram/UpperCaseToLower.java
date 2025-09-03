package StringProgram;

public class UpperCaseToLower {
	public static void main(String[] args) {
		String input = "HELLO WORLD JAVA!!";
		char[] chars = input.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (ch >= 'A' && ch <= 'Z') {
				chars[i] = (char) (ch + 32);
			}
		}
		System.out.println("Original:  " + input);
		System.out.println(chars);
	}

}
