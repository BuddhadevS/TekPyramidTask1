package StringProgram;

public class LowerToUpperCharArray {
	public static void main(String[] args) {
		String input = "Hello World java!";
		char[] chars = input.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (ch >= 'a' && ch <= 'z') {
				chars[i] = (char) (ch - 32);
			}
		}
		System.out.println("Original:  " + input);
		System.out.println(chars);
	}
}
