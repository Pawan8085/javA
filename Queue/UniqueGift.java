package javA.Queue;
import java.util.*;
public class UniqueGift {
    // GFG : First non-repeating character in a stream
    public String FirstNonRepeating(String A)
    {
        
       List<Character> que = new ArrayList<>();
        Map<Character, Integer> map=new HashMap<>();
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<A.length();++i){
            
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i), map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }
            
            que.add(A.charAt(i));
            while(!que.isEmpty() ){
                
                if(map.get(que.get(0))>1){
                    que.remove(0);
                }
                else{
                    ans.append(que.get(0));
                    break;
                }
            }
            
            if(que.isEmpty()){
                ans.append('#');
            }
        }
        
        return ans.toString();
    }
}
