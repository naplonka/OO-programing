package access_modifieres.package1;

public class ExampleClass {
    public void publicMethod(){};
    protected void protectedMethod() {};
    private void privateMethod() {};
    void defaultMethod() {};

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();// Możemy użyć wszystkich method w tej samej klasie
        exampleClass.defaultMethod();
        exampleClass.privateMethod();
        exampleClass.protectedMethod();
        exampleClass.publicMethod();

    }
}
