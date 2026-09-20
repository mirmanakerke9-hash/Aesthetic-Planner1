package planner.factory_method;

public class DailyPageCreator extends PlannerPageCreator {
    @Override
    public PageLayout createPage() {
        return new DailyPageLayout();
    }
}