package NumberProgram;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 1441;
        int original = no;
        int rev = 0;
        while (no != 0) {
            int rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        if (rev == original) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
