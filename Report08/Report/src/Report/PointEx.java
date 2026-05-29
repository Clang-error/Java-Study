package Report;


import java.util.Objects;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override // bash값지 정
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    public String toString() {
        return color + super.toString();
    }
}


public class PointEx {
    public static void main(String[] args) {
        ColorPoint[] cpArr = new ColorPoint[3]; //Color Point를 담을 수 있는 배열공간 생성
        cpArr[0] = new ColorPoint(4, 5, "Red"); //실제 ColorPoint 객체를 만들어 배열칸에저장
        cpArr[1] = new ColorPoint(2, 3, "Yellow");
        cpArr[2] = new ColorPoint(4, 5, "Red"); //bash값을 지정하지않고 비교한다면 cpArr[0]과 다르다고 나옴
        // 틀리다나오는 이유는 equals()메서드가 메모리 주소값만을 비교하기 때문에 false가 나오게된다
        System.out.println("cpArr[0] "+cpArr[0]+"과 cpArr[1] "+cpArr[1]+"은");
        if(cpArr[0].equals(cpArr[1])) {
            System.out.println("같습니다.");
        }else {
            System.out.println("틀립니다.");
        }
        System.out.println("cpArr[0] "+cpArr[0]+"과 cpArr[2] "+cpArr[2]+"은");

        if(cpArr[0].equals(cpArr[2])) {
            System.out.println("같습니다.");
        }else {
            System.out.println("틀립니다.");
        }
    }
}
