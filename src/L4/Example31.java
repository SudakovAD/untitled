package L4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class Example31 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
