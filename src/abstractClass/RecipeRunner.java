package abstractClass;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.cleanup();
        recipe.execute();
    }
}
