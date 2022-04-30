public class Lab5_2_64011013 {
    public static void main(String[] args) {
        RegularPolygon[] rPolygons = new RegularPolygon[3];
        rPolygons[0] = new RegularPolygon();
        System.out.println("-------------1------------");
        System.out.println("Perimeter: " + rPolygons[0].getPerimeter());
        System.out.println("Area: " + rPolygons[0].getArea());

        rPolygons[1] = new RegularPolygon(6,4);
        System.out.println("\n-------------2-------------");
        System.out.println("Perimeter: " + rPolygons[1].getPerimeter());
        System.out.println("Area: " + rPolygons[1].getArea());

        rPolygons[2] = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("\n-------------3------------");
        System.out.println("Perimeter: " + rPolygons[2].getPerimeter());
        System.out.println("Area: " + rPolygons[2].getArea() + "\n");
    }
}
