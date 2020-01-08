package abstractClass.exerciseabstartclass;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for(Animal object : animals){
            object.bark();
        }
    }

}
