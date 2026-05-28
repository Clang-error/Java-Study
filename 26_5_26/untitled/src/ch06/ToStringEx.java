package ch06;

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

public class ToStringEx
{
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println(p);
    }
}
