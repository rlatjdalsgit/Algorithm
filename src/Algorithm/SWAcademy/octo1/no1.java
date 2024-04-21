package Algorithm.SWAcademy.octo1;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (checkPunctuation(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean checkPunctuation(String input) {
        int n = input.length();

        // 문장의 마지막 문자가 마침표인지 확인
        if (input.charAt(n - 1) != '.') {
            return false;
        }

        // 쉼표와 마침표가 처음이나 마지막에 등장하는지 확인
        if (input.charAt(0) == ',' || input.charAt(n - 2) == ',' || input.charAt(n - 3) == '.') {
            return false;
        }

        // 쉼표와 마침표의 위치를 검사
        for (int i = 0; i < n - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            if (currentChar == ',' && (nextChar == ',' || nextChar == '.')) {
                return false;
            }

            if (currentChar == '.' && nextChar == '.') {
                return false;
            }
        }

        return true;
    }
}
