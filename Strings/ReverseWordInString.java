package DSA.Strings;
import java.util.Stack;
public class ReverseWordInString {
    
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        Stack stack = new Stack();
        StringBuilder string = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
                stack.push(arr[i]);
        }
        for(int i=0; i<arr.length; i++) {
           
            String word = stack.pop().toString();
            string.append(word);

            if(i != arr.length-1) {
                string.append(" ");
            }           
        }
        return new String(string);
    }
    public static void main(String[] args) {
        ReverseWordInString rwi = new ReverseWordInString();
        String s = "  Hello World  ";
        System.out.println(rwi.reverseWords(s)); // Output: "World Hello"
    }

}
