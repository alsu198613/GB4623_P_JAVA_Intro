import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = zadanieOneMethod(n);
        System.out.println("res = " + res);
    }

    /**
     * @apiNote описание метода
     * @param n входящее число
     * @return произведение разрядов минус сумма разрядов
     */

    public static int zadanieOneMethod(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }

}

// int pr = n % 10 * (n / 10 % 10) * (n / 100);
        // int sum = n % 10 + n / 10 % 10 + n / 100;
        // int pr = 1;
        // int sum = 0;
        // while (n != 0) {
        //     pr *= n % 10;
        //     sum += n % 10;
        //     n /= 10;
        // }
