import java.util.Scanner;

//Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of digits: ");
        int n = sc.nextInt();
        int k = changePlus(sc, n);
        System.out.println(k);
        sc.close();
    }

    private static int changePlus(Scanner sc, int n) {
        int k = 0;
        int a = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = sc.nextInt();
            if (a >= 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
      
    }

