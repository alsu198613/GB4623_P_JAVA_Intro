import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();

        double result = getPow(x, n);

        System.out.println(result);
    }

    /**
     * @apiNote возведение числа в стпень
     * @param x число
     * @param n степень
     * @return результат
     */
    private static double getPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        if (n == 0) return 1;

        double result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
