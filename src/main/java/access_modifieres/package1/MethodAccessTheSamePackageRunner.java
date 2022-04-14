package access_modifieres.package1;

public class MethodAccessTheSamePackageRunner {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();//klasa w tym samym pakiecie nie można tylko użyć privateMethod
        exampleClass.defaultMethod();
//        exampleClass.privateMethod();
        exampleClass.protectedMethod();
        exampleClass.publicMethod();

    }
}
