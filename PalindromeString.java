import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Built-in StringBuilder se direct reverse karo
        String rev = new StringBuilder(str).reverse().toString();

        // 2. equalsIgnoreCase se check karo (Case sensitive issue nahi hoga)
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is NOT a Palindrome String");
        }

        sc.close();
    }
}