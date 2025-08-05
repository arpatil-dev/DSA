package DSA.Basic_Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Divisors {
    public static List<Integer> getDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=number; i++) {
            if(number % i == 0) {
                divisors.add(i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
    public static void main(String[] args) {
        int number = 36;
        List<Integer> divisors = getDivisors(number);
        for (Integer divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}
