import java.util.Scanner;

public class prog77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Input number
        int k = sc.nextInt();   // Position

        // Step 1: Count total digits
        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Step 2: Check if k is valid
        if (k > count || k <= 0) {
            System.out.println("Invalid position");
            return;
        }

        // Step 3: Remove digits from right to get the k-th digit at last
        int divisor = (int)Math.pow(10, count - k);
        int result = (num / divisor) % 10;

        System.out.println(result);

    sc.close();
}
}
