package abstractClass;

public class Recipe extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Bring something");
    }

    @Override
    void doTheDish() {
        System.out.println("Some");

    }

    @Override
    void cleanup() {
        System.out.println("clean Marysia");

    }
}
