package planner.factory_method;

public abstract class PlannerPageCreator {

    public abstract PageLayout createPage();


    public void displayPage() {
        PageLayout page = createPage();
        page.render();
    }
}