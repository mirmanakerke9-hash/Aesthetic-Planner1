package planner.abstract_factory;

public class MinimalistTheme implements PlannerTheme {
    private static final String MONOCHROME_WHITE = "#FFFFFF"; // Clean code: No magic strings

    @Override
    public String getPrimaryColor() {
        return MONOCHROME_WHITE;
    }

    @Override
    public void applyTheme() {
        System.out.println("[Theme] Applied Minimalist theme (Clean layout, Palette: " + getPrimaryColor() + ")");
    }
}