package L6;
import java.util.Scanner;
public class E1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        if (N <= 40000 && M <= 40000)
            System.out.println(N * (M + 1));
        in.close();
    }

}