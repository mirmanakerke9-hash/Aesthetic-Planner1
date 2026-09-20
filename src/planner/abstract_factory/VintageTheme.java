package planner.abstract_factory;

public class VintageTheme implements PlannerTheme {
    private static final String BEIGE_WARM = "#F5F5DC"; // Clean code: No magic strings

    @Override
    public String getPrimaryColor() {
        return BEIGE_WARM;
    }

    @Override
    public void applyTheme() {
        System.out.println("[Theme] Applied Vintage theme (Kraft paper style, Palette: " + getPrimaryColor() + ")");
    }
}