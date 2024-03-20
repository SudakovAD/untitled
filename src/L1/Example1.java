package L1;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
            /*} catch (RuntimeException e) {*/ //ошибка
            System.out.println("3");
        }
        System.out.println("4");
    }

}

