public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle() {

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    } 

    Triangle(double side1, double side2, double side3, 
                String color, boolean filled) {
        this(side1, side2, side3);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        double s = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt((s*(s-this.side1)) * (s-this.side2) * (s-this.side3));
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nArea: " + getArea() 
                + "\nPerimeter: " + getPerimeter();  
    }
}
