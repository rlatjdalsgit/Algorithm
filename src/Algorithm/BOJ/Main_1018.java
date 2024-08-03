package Algorithm.BOJ;

import java.util.Scanner;

public class Main_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }
        int minChanges = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changesW = calc(board, i, j, 'W');
                int changesB = calc(board, i, j, 'B');
                int minCurrent = Math.min(changesW, changesB);
                minChanges = Math.min(minChanges, minCurrent);

            }
        }
        System.out.println(minChanges);
    }

    static int calc(char[][] board, int startX, int startY, char initialColor) {
        int changes = 0;
        char currentColor = initialColor;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != currentColor) {
                    changes++;
                }
                // 다음 칸의 색은 현재 색과 반대
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            currentColor = (currentColor == 'W') ? 'B' : 'W';

        }
        return changes;
    }
}
