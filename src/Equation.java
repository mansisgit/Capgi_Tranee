import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();



        int result = (a + b) * (a + b) * (a + b);

        System.out.println(result);

    }
}

