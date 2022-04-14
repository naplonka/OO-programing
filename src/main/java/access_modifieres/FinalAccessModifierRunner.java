package access_modifieres;

final class FinalClass {// final przy klasie oznacza nie można po niej dziedziczyć
    // String, Integer są final klasami, żeby nikt nie zmieniał twoich method

}

//class SomeClass extends FinalClass {
//
//}

class SomeClass {
    final public void doSomething(){
    }
    public void doSomethingElse(final int arg) {
//        arg =6; tu jet compilation error
    }
}

class ExtendingClass extends SomeClass {
//    @Override
//    public void doSomething() {//final method nie może być overwrite
//        super.doSomething();
//    }
}

public class FinalAccessModifierRunner {
    public static void main(String[] args) {
        final int i = 5;

        //i = 7; jest final więc wartość nie może być zmieniona

    }
}
