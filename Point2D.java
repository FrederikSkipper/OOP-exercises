public class Point2D {
    private double x;
    private double y;
    public double getValueX() {
    return x;
    }
    public double getValueY() {
    return y;
    }
    public void setValueX(int newValueX) {
        this.x = newValueX;
    }
    public void setValueY(int newValueY) {
        this.y = newValueY;
    }
    public double distance(Point2D p) {
        {
        return Math.sqrt(Math.pow(p.x+p.y, 2)
                         + Math.pow(getValueX()+getValueY(), 2) * 1.0);
    }

    }
}


