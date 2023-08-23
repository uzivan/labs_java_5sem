package Lab20;

import java.util.function.UnaryOperator;
public class Square {
    public static int square(int a){
        UnaryOperator<Integer> squareValue = x -> x * x;
        return squareValue.apply(a);
    }
}
