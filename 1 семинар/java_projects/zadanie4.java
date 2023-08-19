import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n]; // todo : возможно и так int[] nums = {1, 2, 3, 4};
        // заполнение массива
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(getIsSym(nums));

        // печать массива   
        for (int i = 0; i < n; i++) {
            System.out.printf("nums[%d] = %d \n", i, nums[i]);
        }
    }

/**
 * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
 * @param nums - массив из чисел
 * @return сообщение в виде String
 */

    private static String getIsSym(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                return "Массив не симметричен";
            }
        }
        return "Массив симметричен";
    }
}