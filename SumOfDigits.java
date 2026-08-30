import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int t = Math.abs(n);

        while (t > 0) {
            sum += t % 10;

            t /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
