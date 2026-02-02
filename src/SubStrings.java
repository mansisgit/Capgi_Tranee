
public class SubStrings {

    public int countValid(String s){
        int n = s.length();
        int[] prefix = new int[n];
        int count =0;

        for(int i=1;i<n;i++){
            int value = (s.charAt(i)-'a'+2)/3;
            prefix[i]=prefix[i-1]+value;

        }

        for(int start=0;start<n;start++){

        }

    }
    public static void main(String[] args) {

    }
}





/*
*class Solution {

    public int countValidSubstrings(String s) {
        int n = s.length();
        int[] prefix = new int[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            int value = (s.charAt(i) - 'a' + 2) / 3;
            prefix[i + 1] = prefix[i] + value;
        }

        int count = 0;

        // Check all substrings
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = prefix[end + 1] - prefix[start];
                int length = end - start + 1;

                if (sum % length == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

*
**/
