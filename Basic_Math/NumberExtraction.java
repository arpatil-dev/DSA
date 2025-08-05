package DSA.Basic_Math;

public class NumberExtraction {    
    public static void main(String[] args) {
        int number = 9877;
        while(number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            System.out.print(lastDigit + " ");
        }
    }
}
