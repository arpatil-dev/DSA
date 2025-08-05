package DSA.Strings;
import java.util.*;
class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        for (List<String> anagramList : map.values()) {
            group.add(anagramList);
        }
        
        
        return group;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
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
        Anagrams anagrams = new Anagrams();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = anagrams.groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
}
