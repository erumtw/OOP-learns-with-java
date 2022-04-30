public class Pro3 {
    public static void main(String[] args) {
        GeometricObject[] geo = {new Rectangle(1,5), new Rectangle(10,5)};
         System.out.println("Compare between Rectangle 0 and 1: " + ((Rectangle)geo[0]).compareTo((Rectangle)geo[1]));
         System.out.println("Are they equals?: " + ((Rectangle)geo[0]).equals((Rectangle)geo[1]));
    }
}
