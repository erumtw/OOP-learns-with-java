public class Square extends GeometricObject implements Colorable{
    private double side;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
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
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return this.side*4;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Area: " + getArea() 
        + "\nPerimeter: " + getPerimeter();
    }

    @Override
    public String howToColor() {
        // TODO Auto-generated method stub
        return "Color all four sides.";
    }
}
