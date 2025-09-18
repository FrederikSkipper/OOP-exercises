public class Circle {
    final private int x;
    final private int y;
    final private double radius;
    public Circle(int x, int y, double radius) { // constructor
        this.x = x;
        this.y = y;
        this.radius = radius; 
    }
    public int getX() { 
        return x;
    }
    public int getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
    public double centerDistance(int x, int y, int x1, int y1) {
        double result = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) * 1.0);
        return result;
    }
    public double distance() { 
        return 0;
    }
    public double overlaps() {
        return 0;
    }
    public double touches() {
        return 0;
    }
}