package DSA.Strings;
import java.util.Stack;

public class RemoveOutermostParenthesis {
    
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder string = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                if(counter!=0) {
                    string.append('(');
                }
                counter++; 
            }else{
                counter--;
                if(counter!=0) {
                    string.append(')');
                }
            }
        }
        return new String(string);
    }

    // public String removeOuterParentheses(String s) {
    //     Stack stack = new Stack();
    //     StringBuilder string = new StringBuilder();
    //     for(int i=0; i<s.length(); i++) {
    //         if(s.charAt(i)=='(') {
               
    //             if(!(stack.empty())){
    //                 string.append('(');
    //             }
    //              stack.push('(');
    //         }else {
    //             stack.pop();
    //             if(!(stack.empty())){
    //                 string.append(')');
    //             }
    //         }
    //     }
        
    //     return new String(string);
    // }

    public static void main(String[] args) {
        RemoveOutermostParenthesis rop = new RemoveOutermostParenthesis();
        String s = "(()())(())";
        System.out.println(rop.removeOuterParentheses(s)); // Output: "()()()"
    }

}
