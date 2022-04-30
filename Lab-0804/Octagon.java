/**
 * Octagon
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    private double side;

    Octagon() {

    }
    

    Octagon(double side) {
        this.side = side;
    }

    Octagon(double side, String color, boolean filled) {
        this(side);
        super.setColor(color);
        super.setFilled(filled);
    }


    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (2+4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return side*8;
    }

    @Override
    public int compareTo(Octagon o) {
        // TODO Auto-generated method stub
        if (getArea() > o.getArea()) 
            return 1;
        else if (getArea() < o.getArea()) 
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.compareTo((Octagon)obj) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }

}