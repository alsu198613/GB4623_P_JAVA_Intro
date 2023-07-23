import java.util.Scanner;

public class newprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pr = n % 10 * (n / 10 % 10) * (n / 100);
        int sum = n % 10 + n / 10 % 10 + n / 100;
        int res = pr - sum;
        System.out.println("res = " + res);
    }
    
        
}
