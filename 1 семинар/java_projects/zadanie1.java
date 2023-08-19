
/**
 * Subtract the Product and Sum of Digits of an Integer. Given an integer number n, return the difference between the product of its digits and the sum of its digits. 
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
 */


import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = zadanieOneMethod(n);
        System.out.println("res = " + res);
    }

    /**
     * @apiNote описание метода - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
     * @param n входящее число
     * @return произведение разрядов минус сумма разрядов
     */
//вариант с методом 
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

        // вариант для числа любой длины
        // int pr = 1;
        // int sum = 0;
        // while (n != 0) {
        //     pr *= n % 10;
        //     sum += n % 10;
        //     n /= 10;
        // }
