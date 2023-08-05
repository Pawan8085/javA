package javA.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    // Leetcode : 380. Insert Delete GetRandom O(1)

     Map<Integer, Integer> map ;
    List<Integer> list ;
    Random random;
    public InsertDeleteGetRandom() {
      
      map = new HashMap<>();
      list = new ArrayList<>();
      random = new Random();

    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
         
         if(map.containsKey(val)){

             int lastIndexVal = list.get(list.size()-1);

             if(val==lastIndexVal){
                 list.remove(list.size()-1);
                 map.remove(val);
                 return true;
             }

             int indexOfVal = map.get(val);
             list.set(indexOfVal, lastIndexVal);
             map.put(lastIndexVal, indexOfVal);
             list.remove(list.size()-1);
             map.remove(val);
             return true;
         }

         return false;
    }
    
    public int getRandom() {
       int size = list.size();
       int index = random.nextInt(size);
       return list.get(index);

    }
}
