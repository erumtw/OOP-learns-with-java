/**
 * Pro2
 */
public class Pro2 {

    public static void main(String[] args) {
        GeometricObject[] squares = {new Square(4), new Square(5),new Square(6), 
            new Square(7), new Square(8),};
            
        System.out.println();
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i+1) + ": " + ((Square)squares[i]).getSide());
            System.out.println(squares[i].toString() );
            System.out.println("How to color: " + ((Square)squares[i]).howToColor()+ "\n");
        }
    }
}