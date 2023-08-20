public class zadanie3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 1 };
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) {
                count++;
            }
        }
    }
}
