package ch05;

class Point {
    private int x, y;
    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) { //여기로도착
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x,int y,String color) {
        super(x,y); //부모생성자로 데이터보냄
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint(); //부모기능 호출
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(10,20,"red");
        cp.showColorPoint();
    }
}

