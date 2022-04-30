/**
 * Pro1_64011013
 */
public class Pro1_64011013 {
    public static void main(String[] args) {
        // ax + by = e
        // cx + dy = f 
        // x = (ed-bf) / (ad-bc)
        // y = (af-ec) / (ad-bc) 
        // 3.4x + 50.2y = 44.5
        // 2.1x + 0.55y = 5.9
        float x, y;
        float a = 3.4f, b = 50.2f, c = 2.1f, d = 0.55f, e = 44.5f, f = 5.9f;
        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c); 
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}