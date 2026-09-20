package planner.factory_method;

public class WeeklyPageLayout implements PageLayout {
    @Override
    public void render() {
        System.out.println("[Page Layout] Rendering Weekly Planner with 7-day overview and habit tracker.");
    }
}
