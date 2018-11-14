
package pl.waw.sgh;

import java.util.Scanner;

public class tic_tac_toe {
    static char board[][] = new char[3][3];
    static int cnt = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------");

        // 배열을 초기화
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        int x = 0, y = 0;

        do {
            // 그래프 작성
            graph();

            System.out.print("Enter Axis : ");
            x = sc.nextInt();
            y = sc.nextInt();
            // 배열에 값이 있다면 다시 좌표 입력, 그렇지 않다면 X표
            if (board[x][y] != ' ') {
                System.out.println("Wrong Location.");
                continue;
            }
            //잘못된 위치가 아니라면 'X'표시, cnt값은 무승부를 위해서 존재
            else {
                board[x][y] = 'X';
                cnt++;
                //cnt값이 5가 되면서 무승부와 승리조건이 동시에 달성되기 때문에 이를 결정
                if (cnt >= 5) {
                    rule();
                }
            }

            // 컴퓨터 차례, 랜덤한 수 입력
            int a = (int) (Math.random() * 3);
            int b = (int) (Math.random() * 3);

            // 해당 배열 위치에 X나 O가 있으면 a,b값을 다시 할당
            while (board[a][b] == 'X' || board[a][b] == 'O') {
                a = (int) (Math.random() * 3);
                b = (int) (Math.random() * 3);
            }

            // 컴퓨터 차례, a,b 좌표를 랜덤으로 입력받아서 그 위치를 'O'표시
            board[a][b] = 'O';

            // 승리조건,패배조건,무승부조건
            rule();
        } while (cnt <= 5);
    }

    private static void graph() {
        for (int i = 0; i < 3; i++) {
            System.out.print("│ ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " │ ");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }

    private static void rule() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                System.out.println("Win");
                graph();
                cnt = 6;
                break;
            } else if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                System.out.println("Lose");
                graph();
                cnt = 6;
                break;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                System.out.println("Win");
                graph();
                cnt = 6;
                break;
            } else if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                System.out.println("Lose");
                graph();
                cnt = 6;
                break;
            }
        }
        // 오른쪽 대각선 승리,패배조건
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            System.out.println("Win");
            graph();
            cnt = 6;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            System.out.println("Lose");
            graph();
            cnt = 6;
        }
        // 왼쪽 대각선 승리, 패배조건
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            System.out.println("Win");
            graph();
            cnt = 6;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
            System.out.println("Lose");
            graph();
            cnt = 6;
        }
        // cnt가 5이상인 경우에서 승리(cnt=6)과 무승부(cnt=5)경우가 있으므로 승리가 아니면 cnt값은 최대가 5이기 때문에 cnt가 5일때 무승부 조건
        if (cnt == 5) {
            System.out.println("Tie.");
            graph();
        }
    }
}