package Interview_Master_100;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);

    }
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String >> map = new HashMap<>();

       for (String str : strs) {
           char[] ch = str.toCharArray();
           Arrays.sort(ch);
           String sortedArray = new String(ch);


           if (!map.containsKey(sortedArray)) {
               map.put(sortedArray,new ArrayList<>());
           }
           map.get(sortedArray).add(str);
       }

       return new ArrayList<>(map.values());

    }
}
