public class HashMove {
    public static void main(String[] args) {
        String s = "#msi#ndf#ndhf###";
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) sb.append(ch);
            else word.append(ch);
        }

        System.out.println(sb.append(word).toString());
        StringBuilder s1b = new StringBuilder();


    }

}

