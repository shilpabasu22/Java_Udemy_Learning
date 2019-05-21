package udemy.Classes.Constructor;

public class Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
    private int x;
    private int y;

    public Point(int x, int y){
       setX(x);
       setY(y);
    }
    public Point(){
        this(0,0);
    }

    public double distance(){
        return distance(0,0);
    }
    public double distance(Point point){
        return distance(point.x,point.y);
    }

    public double distance(int x, int y){
        return Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));

    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}
