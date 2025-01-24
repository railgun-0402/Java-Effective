import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void hello() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(3, 2);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        System.out.println(point1.equals(point2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}


