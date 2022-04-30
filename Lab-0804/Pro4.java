public class Pro4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(5);
        System.out.println("Real octagon\n" + oct1.toString());
        Octagon octcopy = (Octagon)oct1.clone();

        int equals = (oct1.compareTo(octcopy));

        if (equals == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (equals == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
    }
}
