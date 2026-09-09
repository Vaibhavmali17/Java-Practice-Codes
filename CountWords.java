import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Total words: 0");
        } else {          
            // Space se split karke direct length le lo
            String[] words = str.split("\\s+");
            System.out.println("Total words: " + words.length);
        }

        sc.close();
    }
}
