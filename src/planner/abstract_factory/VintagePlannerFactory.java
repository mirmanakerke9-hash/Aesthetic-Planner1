package planner.abstract_factory;

public class VintagePlannerFactory implements AestheticPlannerFactory {
    @Override
    public PlannerTheme createTheme() {
        return new VintageTheme();
    }

    @Override
    public StickerPack createStickerPack() {
        return new VintageStickerPack();
    }
}
