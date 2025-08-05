package DSA.Basic_Math;

public class Prime {
    public static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 7;
        if(isPrime(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
