package planner.factory_method;

public class DailyPageLayout implements PageLayout {
    @Override
    public void render() {
        System.out.println("[Page Layout] Rendering Daily Planner with hourly schedule and top priorities.");
    }
}