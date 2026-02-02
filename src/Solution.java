import java.util.List;

public class Solution {
    public static void main(String[] args) {

        //1
        String s = "this is sample string";
        System.out.println(countValidWords(s));
    }

    public static int countValidWords(String s){

        if(s=="null" || s.length()==0) return 0;

        int count =0;

        String[] words = s.split("\\s+");

        for(String word : words){
            if(isValid(word)) count++;
        }

        return count;
    }

    public static boolean isValid(String word){
        if(word.length()< 3) return false;

        boolean hasVowel = false;
        boolean hasConst = false;

        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;

            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);

                if(isVowel(lower)){
                    hasVowel= true;
                } else {
                    hasConst = true;
                }
            }
        }
        return hasVowel && hasConst;
    }

    public static boolean isVowel(char c){

        if("aeiouAEIOU".indexOf(c)!=-1) return true;

        return false;
    }


}
