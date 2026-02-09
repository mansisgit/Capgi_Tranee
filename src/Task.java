public class Task {
    class Student {
        private static int counter = 1;
        private int enrollmentNumber;
        private String name;

        public Student(String name) {
            this.name = name;
            this.enrollmentNumber = counter;
            counter++;
        }

        @Override
        public String toString() {
            return enrollmentNumber + ": " + name;
        }
    }
    public static long[] factorSum(int[] arr) {
        long[] result = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            long sum = 0;

            for (int j = 1; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    sum += j;
                    if (j != n / j) {
                        sum += n / j;
                    }
                }
            }
            result[i] = sum;
        }
        return result;
    }


}
