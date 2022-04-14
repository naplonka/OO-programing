package access_modifieres;

import access_modifieres.package1.ExampleClass;

public class MethodAccessRunner {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();//w innnym pakiecie mamy dostęp tylko do public method
//        exampleClass.defaultMethod();
//        exampleClass.privateMethod(); ten sam pakiet, bez dziedziczenia
//        exampleClass.protectedMethod(); protected możemy także użyć w subklasie, dziedziczonej
        exampleClass.publicMethod();

    }
}
