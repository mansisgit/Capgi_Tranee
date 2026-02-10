import java.util.Scanner;

public class TyreCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);
            System.out.println(tyres);
        }

    }
}

