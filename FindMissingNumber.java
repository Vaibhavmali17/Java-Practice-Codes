public class FindMissingNumber {
    public static void main(String[] args) {
        // Array me 1 to 6 hona chahiye tha, but 4 missing hai
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10};
        int n = arr.length + 1; // Total numbers should be length + 1

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);
    }
}