
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // 1. Built-in StringBuilder (Sabse fast aur recommended)
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed using StringBuilder: " + reversed);
        
         // 2. Built-in StringBuffer (Thread-safe alternative)
        StringBuffer sbf = new StringBuffer(original);
        System.out.println("Reversed using StringBuffer: " + sbf.reverse());

       
        // Palindrome check using built-in reversed string
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Status: Palindrome");
        } else {
            System.out.println("Status: Not Palindrome");
        }

        sc.close();
    }
}