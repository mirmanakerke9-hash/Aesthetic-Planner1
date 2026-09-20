package planner.abstract_factory;

public interface AestheticPlannerFactory {
    PlannerTheme createTheme();
    StickerPack createStickerPack();
}