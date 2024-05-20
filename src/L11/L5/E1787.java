package L11.L5;
import java.util.Scanner;
public class E1787 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int k = in.nextInt();
    int n = in.nextInt();
    int totalCars = 0;

    if (k < 1 || k > 100 || n < 1 || n > 100)
        return;

    for (int i = 0; i < n; i++) {
        int a = in.nextInt();
        if (a < 0 || a > 100)
            return;
        totalCars = a + totalCars - k;
        totalCars = Math.max(0, totalCars);
    }

    System.out.println(totalCars);

    in.close();
}
}
