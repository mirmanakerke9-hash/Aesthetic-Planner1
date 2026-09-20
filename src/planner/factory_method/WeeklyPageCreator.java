package planner.factory_method;

public class WeeklyPageCreator extends PlannerPageCreator {
    @Override
    public PageLayout createPage() {
        return new WeeklyPageLayout();
    }
}
