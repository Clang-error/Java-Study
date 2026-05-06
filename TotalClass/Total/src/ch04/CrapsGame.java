package ch04;
// 먼저 주사위 2개르 굴린다
// 7,11 이 나오면 이긴다. 2, 3 ,12 가 나오면 진다
// 4 5 6 8 9 10 이 나오면 나온 숫자가 게임 숫자(포인트)가 된다.
// 게임숫자나 7이 나올때까지 계속 굴린다.
//-- 게임 숫자가 나오면 이긴다.
//-- 7이 나오면 진다
public class CrapsGame {
    public CrapsGame() {
        new Craps(120);
    }

    public static void main(String[] args) {
        new CrapsGame();
    }
}

class Craps extends Dices { //상속
    int point;
    int tryCount = 0;
    int wonCount = 0;
    int WON = 1;
    int LOST = 2;
    int RETRY = 0;
    Craps(int cnt) {
        for (int i = 0; i < cnt ; i++) {
            tryCount++;
            System.out.print(String.format("try %d ", tryCount));
            doGame();
            System.out.println(String.format("won %d", wonCount));
        }
    }

    void doGame() {
        rolling();
        System.out.println(this.toString());
        if(isSevenElevens()) {
          wonCount++;
          System.out.println("You won");
        }else if(isCraps()) {
            System.out.println("You lost");
        }else {
            point = getSum();
            rolling();
            System.out.println(this.toString());
            while(getDicision() == RETRY) {
                rolling();
                System.out.println(this.toString());
            }
            if(getDicision() == WON) {
                wonCount++;
                System.out.println("You won");
            }else {
                System.out.println("You lost");
            }
        }
    }

    int getDicision() {
        if(getSum() == point) {
            return WON;
        }else if(getSum() == 7) {
            return LOST;
        }else {
            return RETRY;
        }
    }
    boolean isCraps() {
        if(getSum() == 2 || getSum() == 3 || getSum() == 12) {
            return true;
        }
        return false;
    }

    boolean isSevenElevens() {
        if(getSum() == 7 || getSum() == 11) {
            return true;
        }
        return false;
    }

}