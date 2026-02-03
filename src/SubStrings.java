
public class SubStrings {

    public static void main(String[] args) {
        String s ="Thisiss amplest rings";
        System.out.println(countValidSubstrings(s));
    }

    public static int countValidSubstrings(String s) {
        s=s.replaceAll("\\s+","");
        int len = s.length();
        int[] val = new int[len];

        for(int i=0;i<len;i++){
            val[i]= (s.charAt(i)-'a'+2)/3;
        }
        int count =0;

        for(int i=0;i<len;i++){
            int sum =0;
            for(int j=i;j<len;j++){
                sum+=val[j];
                int length = j-i+1;

                if(sum%len==0) count++;
            }
        }
        return count++;
    }
}

