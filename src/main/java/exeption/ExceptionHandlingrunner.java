package exeption;

public class ExceptionHandlingrunner {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        String str = null;
        str.length();
        System.out.println();
    }

    //Jeżeli nie wyłapiemy wyjątku exceptionala to natępne metody nie są wykonywane
    //Expetion idzie łancuchowo do góry, czyli wyjątek wystepuje w method1, 'pójdzie' on także do main method
}
