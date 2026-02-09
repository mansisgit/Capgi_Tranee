class Student {
    private static int counter = 1;
    private int enrollmentNumber;
    private String name;

    public Student(String name) {
        this.name = name;
        this.enrollmentNumber = counter++;
    }

    @Override
    public String toString() {
        return enrollmentNumber + ": " + name;
    }
}

//make beautiful
//public static int makeBeautiful(String s) {
//    int ops = 0;
//    char[] arr = s.toCharArray();
//
//    for (int i = 1; i < arr.length; i++) {
//        if (arr[i] == arr[i - 1] || Math.abs(arr[i] - arr[i - 1]) == 1) {
//            ops++;
//            arr[i] = 'z'; // force safe character
//        }
//    }
//    return ops;
//}
