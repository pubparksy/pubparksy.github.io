import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 문자열 그대로 사용
        int length = input.length(); // 문자열의 character 길이 확인.
        for (int i = 0; i < length; i++) {
            System.out.println(i); 
        }
        scanner.close();
    }
}