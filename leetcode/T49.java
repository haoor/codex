package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class T49 {
    public static void main(String[] args) {
        T49 t = new T49();
        String[][] inputs = new String[][] {
                new String[] { "eat", "tea", "tan", "ate", "nat", "bat" },
                new String[] { "" },
                new String[] { "a" }
        };
        for (String[] input : inputs) {
            List<List<String>> result = t.groupAnagrams(input);
            System.err.println(result.toString());
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String temp : strs) {
            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(temp);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}