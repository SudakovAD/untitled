package L11.L5;
import java.util.Scanner;
public class E1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        if (n * m % 2 == 0)
            System.out.println("[:=[first]");
        else
            System.out.println("[second]=:]");

        in.close();
    }
}
