package Report05;
import java.util.Random;

public class MineSweeper {
    Random random = new Random();
    private final char[][] board = new char[10][20]; //지뢰찾기 게임을 위한 2차원 배열


    public static void main(String[] args) {
        MineSweeper game = new MineSweeper();
        game.run();
    }

    public void run() {
        setMine();
        setNearMine();
        printBoard();
    }

    void setMine() {
        for (int i = 0; i < 10; i++) { //전체 배열을 우선 '0'으로 초기화
            for (int j = 0; j < 20; j++) {
                board[i][j] = '0';
            }
        }

        for (int i = 0; i < 10; i++) { //각각으 칸에 15프로의 확률로 지뢰를 배치
            for (int j = 0; j < 20; j++) {
                if(random.nextInt(100) < 15) {
                    board[i][j] = '*';
                }
            }
        }
    }

    void setNearMine() {
        for (int i = 0; i < 10; i++) { //현재위치에서 상하 좌우 대각선까지의 위치를 확인하여 주변에 지뢰가 있는지 확인
            for (int j = 0; j < 20; j++) {
                if(board[i][j] == '*') {continue;}
                if (i + 1 < 10 && board[i+1][j] == '*') {board[i][j] += 1;} //아스키문자열 0은 48 1은 49 1을더해 49를 만드는구조
                if (i - 1 >= 0 && board[i-1][j] == '*') {board[i][j] += 1;} //2 3 4... 또한 +1씩을 더하면 아스키로 원하는 수가나옴
                if (j + 1 < 20 && board[i][j+1] == '*') {board[i][j] += 1;} //범위를 탐색할때 위 또는 아래 그리고 대각선이 범위를 벗어나진않는지 확인함
                if (j - 1 >= 0 && board[i][j-1] == '*') {board[i][j] += 1;} //else if문을 사용하면 한번 탐색후 탐색을 멈추기때문에 전부 if문으로 조건 탐색
                if (i + 1 < 10 && j + 1 < 20 && board[i+1][j+1] == '*') {board[i][j] += 1;}
                if (i + 1 < 10 && j - 1 >= 0 && board[i+1][j-1] == '*') {board[i][j] += 1;}
                if (i - 1 >= 0 && j - 1 >= 0 && board[i-1][j-1] == '*') {board[i][j] += 1;}
                if (i - 1 >= 0 && j + 1 < 20 && board[i-1][j+1] == '*') {board[i][j] += 1;}
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
