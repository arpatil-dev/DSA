package DSA.Strings;
class Palindrome {
    public boolean isPalindrome(String s) {
        int counter = s.length()-1;
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(str);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=str.charAt(counter)) return false;
            counter--;
        }
        return true;
    }
}
