import java.util.Scanner;

public class SerialMultiplier {
    private int[] numbers;
    private int count;

    public SerialMultiplier(int[] nums) {
        numbers = nums;
        count = nums.length;
    }

    @Override
    public String toString() {
        long product = 1;
        for (int i = 0; i < count; i++) {
            product *= numbers[i];
        }
        return String.valueOf(product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SerialMultiplier sm = new SerialMultiplier(nums);
        System.out.println(sm);
    }
}
