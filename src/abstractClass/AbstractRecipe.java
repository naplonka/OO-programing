package abstractClass;

public abstract class AbstractRecipe {
    // W klasie abtrakcyjnej można tworzyć zmienne i umieścić ciało motody
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanup();
}
