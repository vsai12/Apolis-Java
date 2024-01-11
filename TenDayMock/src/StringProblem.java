import java.util.HashMap;
import java.util.Map;

public class StringProblem {
    static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> m1 = new HashMap();
        for(char c: s1.toCharArray()) {
            if(!m1.containsKey(c))
                m1.put(c,1);
            else
                m1.put(c,m1.get(c) + 1);
        }
        for(char c: s2.toCharArray()) {
            if(!m1.containsKey(c))
                return false;
            else {
                int val = m1.get(c);
                if(val == 0)
                    return false;
                m1.put(c, m1.get(c) - 1);
            }
        }
        return true;
    }
}
