package NumberProgram;

public class LargestOfNumber {
	public static void main(String[] args) {
		int a =10;
		int b= 20;
		int c=15;
		int d = 12;
		int e = 14;
//		int largest = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
//		System.out.println(largest);
		
		
		int large = a;
		if(b>large) {
			large = b;
		}
		if(c>large) {
			large = c;
		}
		if(d>large) {
			large = d;
		}
		if(e>large) {
			large = e;
		}
		System.out.println(large);
	}

}
