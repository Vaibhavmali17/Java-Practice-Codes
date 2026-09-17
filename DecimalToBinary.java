import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int temp = n;
        String binary = "";

        if (temp == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                int rem = temp % 2;
                binary = rem + binary;
                temp = temp / 2;
            }
        }

        System.out.println("Binary of " + n + " is: " + binary);
        sc.close();
    }
} 