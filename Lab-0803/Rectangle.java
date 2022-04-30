/**
 * Rectangle
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double length;
    private double width;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width, String color, boolean filled) {
        this(length, width);
        super.setColor(color);
        super.setFilled(filled);
    }


    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width * length;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return (width*2)+(length*2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Area: " + getArea()
                + "Perimeter " + getPerimeter() ;
    }

    @Override
    public int compareTo(Rectangle o) {
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
        return this.compareTo((Rectangle)obj) == 0;
    }

}