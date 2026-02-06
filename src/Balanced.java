public class Balanced {

        public static int canBeBalanced(String s) {
            int balance = 0, minBalance = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') balance++;
                else balance--;
                minBalance = Math.min(minBalance, balance);
            }

            if (balance == 0 && minBalance >= 0) return 1;
            if (balance == 2 && minBalance >= 0) return 1;
            if (balance == -2 && minBalance >= -1) return 1;

            return 0;
        }

    public static void main(String[] args) {
        String s ="(())";
        System.out.println(canBeBalanced(s));
    }
    }


