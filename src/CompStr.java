import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompStr {
    public static void main(String[] args) {
        String s = "abbbafffgggjhiii";
        LinkedHashMap<Character,Integer> amp = new LinkedHashMap<>();

        for(char ch : s.toCharArray()){
            amp.put(ch,amp.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : amp.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }
}
