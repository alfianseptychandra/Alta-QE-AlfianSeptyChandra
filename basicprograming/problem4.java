import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
