package DOM;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.println("Введите вашу фамилию:");
     String x = in.nextLine();
     System.out.println("Введите ваше имя:");
     String x1 =in.nextLine();
     System.out.println("Введите ваше отчество:");
     String x2 =in.nextLine();
     System.out.println(x + " " + x1 + " " + x2);
    }
}
