package StringProgram;

public class Consonent {
	public static void main(String[] args) {
		String s = "Hello this is vowel";
		int count  =0;
		
		StringBuilder builder = new StringBuilder();
		
		s=s.toLowerCase();
		char c[]=s.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]!='a'|| c[i]!='e'|| c[i]!='i'|| c[i]!='o'|| c[i]!='u') {
				count++;

			}
		}
		System.out.println("No of Consonent is "+ count);
	}

}
