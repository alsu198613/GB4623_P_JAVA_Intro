import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = getSum(sc, n);
        System.out.println(res);
    }

/**
 * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
 * @param sc
 * @param n
 * @return
 */
    private static int getSum(Scanner sc, int n) {
        int a = sc.nextInt();
        int res = 0;
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (a % 2 == 0 && b % 10 == 5) {
                res += b;
            }
            a = b;
        }
        return res;
    }
}
