package DSA.Basic_Math;

public class NumberExtractionReverse {
    public static void main(String[] args) {
        int number = 7789;
        int reverseNumber = 0;
        System.out.println("Original Number : " + number);
        while(number > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        }        
        System.out.println("Reverse Number: " + reverseNumber);
    }
}
