package tipsandtrics.nested_classes;

class Person {}

public class NestedClassRunner {

    class InnerClass {}// zagnieżona klasa niestatyczna no-static, wewnętrzna, masz dostęp do zmiennych

    static class StaticNestedClass {} //nie masz dostępu do zmiennych w NestedClassRunnner

    public static void main(String[] args) {

//        InnerClass innerClass = new InnerClass();  tu mamy bład kompilacji, nie możemy stworzyć instancji klasy niestatycznej
        StaticNestedClass staticNestedClass = new StaticNestedClass();// to jest dozwolone, nie musimy tworzyć instancji klasy
        // w której static class jest zagnieżdzona, że stworzyć instancje tej klasy

        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass(); //w tym przypadku żeby stworzyć instancji klasy niestatycznej,
        // musimy najpierw stworzyć instancji klasy w której jesteśmy zagnieżdzeni (Static Nested Class)
    }
}
