
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int t = n, sum = 0, digits = 0;

        // Count digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate sum of digits raised to power
        while (t > 0) {
            int rem = t % 10;
            sum += Math.pow(rem, digits);
            t /= 10;
        }

        if (n == sum) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is NOT an Armstrong Number");
        }
        sc.close();
    }
}