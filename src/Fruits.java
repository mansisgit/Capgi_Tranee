import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fruits {
    public static List<Integer> hasVowels(List<String> strArr, List<String> query) {

        int n = strArr.size();
        int[] prefix = new int[n + 1];
        String v = "aeiou";

        for (int i = 1; i <= n; i++) {
            String s = strArr.get(i - 1);
            prefix[i] = prefix[i - 1] + ((v.indexOf(s.charAt(0)) != -1 && v.indexOf(s.charAt(s.length() - 1)) != -1) ? 1 : 0);
        }

        List<Integer> res = new ArrayList<>();

        for (String q : query) {
            int dash = q.indexOf('-');
            int l = Integer.parseInt(q.substring(0, dash));
            int r = Integer.parseInt(q.substring(dash + 1));
            res.add(prefix[r] - prefix[l - 1]);
        }

        return res;
    }
}
/*
int n = strarr.size();
int[] prefic= new int[n+1];
String v = "eaiout

for(int i=1;i<=n;i++){
String s = strArr.get(i-1);
prfic[i] = prefix[i+1] + ((v.indexOf(s.charat(0)) != -1 && v.indexOf(s.charat(s.chart(s
* **/
