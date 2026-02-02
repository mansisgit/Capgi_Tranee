import java.util.List;

public class Solution {
    public static void main(String[] args) {

        //1
        String s = "this is sample string";
        System.out.println(countValidWords(s));
    }

    public static int countValidWords(String s){

        if(s=="null" || s.length()==0) return 0;


        String[] words = s.split("\\s+");

    }

}
