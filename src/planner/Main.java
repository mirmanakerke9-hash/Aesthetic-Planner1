package planner;

import planner.abstract_factory.*;
import planner.factory_method.*;

public class Main {


    public static void initializePlannerApp(AestheticPlannerFactory factory, String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Planner owner name cannot be empty or null.");
        }

        System.out.println("=== Aesthetic Planner for: " + ownerName + " ===");


        PlannerTheme theme = factory.createTheme();
        StickerPack stickerPack = factory.createStickerPack();

        theme.applyTheme();
        stickerPack.renderStickers();
    }

    public static void main(String[] args) {
        System.out.println("--- PART A: FACTORY METHOD DEMO ---");
        PlannerPageCreator dailyCreator = new DailyPageCreator();
        dailyCreator.displayPage();

        PlannerPageCreator weeklyCreator = new WeeklyPageCreator();
        weeklyCreator.displayPage();

        System.out.println("\n--- PART B: ABSTRACT FACTORY DEMO ---");


        AestheticPlannerFactory minimalistFactory = new MinimalistPlannerFactory();
        initializePlannerApp(minimalistFactory, "Aruzhan");

        System.out.println();


        AestheticPlannerFactory vintageFactory = new VintagePlannerFactory();
        initializePlannerApp(vintageFactory, "Aruzhan");
    }
}