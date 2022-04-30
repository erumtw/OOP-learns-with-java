public class RegularPolygon {
    private int n = 3; // number of sides
    private double side = 1; // length of side
    private double x = 0; // x-coordinate
    private double y = 0; // y-coordinate

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side){
        this();
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this(n, side);
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public double getSide() {
        return this.side;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setN() {
        this.n = n;
    }

    public void setSide() {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (n*side*side)/(4*Math.tan((Math.PI/n)));
    }
}
