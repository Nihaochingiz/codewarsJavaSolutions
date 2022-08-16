
//task:  You're a square! (http://www.codewars.com/kata/youre-a-square)
import java.lang.*;




public class youAreSquare {

    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }
    public static void main () {
        System.out.println(isSquare(-1));
    }
}
