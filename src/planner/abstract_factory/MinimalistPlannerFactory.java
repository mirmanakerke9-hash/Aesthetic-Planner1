package planner.abstract_factory;

public class MinimalistPlannerFactory implements AestheticPlannerFactory {
    @Override
    public PlannerTheme createTheme() {
        return new MinimalistTheme();
    }

    @Override
    public StickerPack createStickerPack() {
        return new MinimalistStickerPack();
    }
}