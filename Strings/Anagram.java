package DSA.Strings;

import java.util.*;

class Anagram {
    // public boolean isAnagram(String s, String t) {
    // if(s.length() != t.length()) return false;
    // Map<Character,Integer> map1 = new HashMap<>();
    // Map<Character,Integer> map2 = new HashMap<>();
    // for(int i=0; i<s.length(); i++) {
    // if(!(map1.get(s.charAt(i)) == null))
    // {
    // map1.replace(s.charAt(i),map1.get(s.charAt(i))+1);
    // }else {
    // map1.put(s.charAt(i),1);
    // }
    // if(!(map2.get(t.charAt(i)) == null))
    // {
    // map2.replace(t.charAt(i),map2.get(t.charAt(i))+1);
    // }else {
    // map2.put(t.charAt(i),1);
    // }
    // }

    // boolean flag = true;
    // for(Character key : map1.keySet()) {
    // int value1 = map1.get(key);
    // int value2 = map2.get(key);
    // System.out.println("Key: " + key + ", Value in s: " + value1 + ", Value in t:
    // " + value2);
    // if(value1 != value2) {
    // flag = false;
    // break;
    // }
    // }
    // return flag;
    // }

    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i=0; i<sArray.length; i++) {
            if(sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        // String s = "aacc";
        // String t = "ccac";
        // String s = "rat";
        // String t = "car";
        // String s = "aa";
        // String t = "bb";
        String s = "anagram";
        String t = "margana";

        System.out.println(anagram.isAnagram(s, t)); // Output: true
    }
}