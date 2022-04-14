package exeption;

public class ExceptionHandlingrunner2 {
    public static void main(String[] args) {
        method2();
        System.out.println("Main ended");
    }

    private static void method1() {
        try {
            String str = null;
            str.length();
            System.out.println("Methos 1 ended");
        } catch (NullPointerException ex) {// możemy wyłapać konkretny wyjątek np  NullPointerException ex
            ex.printStackTrace();//dzięki wyłapaniu wyjątku metoda 2 i main wykonają się
        } catch (Exception ex) {
            System.out.println("Matched exeption");//jeżeli pojawi się inny wyjątek to także go wyłap
            ex.printStackTrace();
        }

    }

    private static void method2() {
        method1();
        System.out.println("Method 2 ended");
    }
}
