import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = changeString(str);
        System.out.println(result);
    }

    private static String changeString(String str){
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2);
        String result = str2 + str1;
        return result;
    }
}
