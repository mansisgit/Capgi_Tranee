import java.util.*;

public class MissingWords {
    public static void main(String[] args) {
        String s = "I like cheese";
        String t = "like";

        String[] sArr = s.split(" ");
        String[] tArr = t.split(" ");

        List<String> result = new ArrayList<>();

        int j = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (j < tArr.length && sArr[i].equals(tArr[j])) {
                j++;
            } else {
                result.add(sArr[i]);
            }
        }

        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}

