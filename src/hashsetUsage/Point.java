package hashsetUsage;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + this.x + " " + this.y + "]";
    }

    @Override
    public int hashCode() {
        return this.x + y;
    }

    @Override
    public boolean equals(Object obj) {
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }
}
