package StringProgram;

public class Annagram {
	public static void main(String[] args) {
		String s = "silent";
		String s2 = "listen";
		char c[]=s.toCharArray();
		char[]c2= s2.toCharArray();
		for(int i=0; i<c.length; i++) {
			for(int j=i+1;j<c.length; j++) {
				if(c[i]>c[j]) {
					c[i]=(char)(c[i]+c[j]);
					c[j]=(char)(c[i]-c[j]);
					c[i]=(char)(c[i]-c[j]);
				}
			}
		}
		System.out.println(c);
		
		for(int i=0; i<c2.length; i++) {
			for(int j=i+1;j<c2.length; j++) {
				if(c2[i]>c2[j]) {
					c2[i]=(char)(c2[i]+c2[j]);
					c2[j]=(char)(c2[i]-c2[j]);
					c2[i]=(char)(c2[i]-c2[j]);
				}
			}
		}
		System.out.println(c2);
		boolean flag = true;
		for(int i=0; i<c.length; i++) {
			if(c.length!=c2.length) {
				flag= false;
				break;
			}
		}
		if(flag) {
			System.out.println("This is a annagram");
		}
		else {
			System.out.println("This is not a annagram");
		}
	}

}
