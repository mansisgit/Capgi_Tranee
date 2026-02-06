public class Point {

    private final int x;
    private final int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Point)) return false;
        Point p = (Point) obj;
        return x==p.x && y==p.y;
    }

    @Override
    public int hashCode() {
        return 31*x+y;
    }

    public static void main(String[] args) {

    }
}

 interface LineOperations {
    double length();
    boolean startsFrom(Point point);
}

class Line implements LineOperations{
    private final Point start;
    private final Point end;

    public double length()


}
