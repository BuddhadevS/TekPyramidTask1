package StringProgram;

public class ResevereStringPosition {
	public static void main(String[] args) {
		String s = "I love kolkata";
		String s2 ="";
		String s3[]=s.split(" ");
		for(int i=s3.length-1; i>=0; i--) {
			s2 = s2+s3[i]+" ";
		}
		System.out.println(s2.toString());
	}

}
