package planner.abstract_factory;

public class MinimalistStickerPack implements StickerPack {
    @Override
    public void renderStickers() {
        System.out.println("[Stickers] Displaying Minimalist stickers: Simple lines and geometric shapes.");
    }
}
