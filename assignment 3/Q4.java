import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 2: ");
        int n = scanner.nextInt();
        boolean A = true;
        int i = 2;
        while (i * i <= n) { 
            if (n % i == 0) {
                A = false; 
                break; 
            }
            i=i+1; 
        }
        if (A) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
