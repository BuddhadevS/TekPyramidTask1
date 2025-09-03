package StringProgram;

public class Punctuation {
	public static void main(String[] args) {
		String s = "Hi @all this is the final call !!!";
		int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }

        System.out.println("Total number of punctuation characters: " + count);
   
	}

}
