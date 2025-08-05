package DSA.Strings;
public class LargestOddNumberInString {
    
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            // System.out.println(Integer.parseInt(num.charAt(i)+""));
            if((num.charAt(i)-'0')%2==0) {
                i--;
            }else{
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        LargestOddNumberInString lons = new LargestOddNumberInString();
        String num = "52";
        System.out.println(lons.largestOddNumber(num)); // Output: "5"
    }

}
