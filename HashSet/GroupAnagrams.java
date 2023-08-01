package javA.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    // Leetcode : 49. Group Anagrams

    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> result = new ArrayList<>();

        for(int i=0;i<strs.length;++i){
            String sorted = sortString(strs[i]);
            if(map.containsKey(sorted)){

                List<String> list = map.get(sorted);
                list.add(strs[i]);

                map.put(sorted, list);
            }else{
                 List<String> list = new ArrayList<>();
                 list.add(strs[i]);
                 map.put(sorted, list);
            }
        }

        for(String s: map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }

    public String sortString(String s){

        char[] characters = s.toCharArray();
        Arrays.sort(characters);

        StringBuilder sorted= new StringBuilder();
        for(int i=0;i<characters.length;++i){
            sorted.append(characters[i]);
        }

        return sorted.toString();
    }

}
