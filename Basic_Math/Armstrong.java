package DSA.Basic_Math;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        while(num > 0) {
            int digit = num % 10;
            result += Math.pow(digit,3);
            num /= 10;
        }
        if(originalNum == result) {
            return true;
        } else {
            return false;
        }
    }    
    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
