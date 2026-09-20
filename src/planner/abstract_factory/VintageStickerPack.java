package planner.abstract_factory;

public class VintageStickerPack implements StickerPack {
    @Override
    public void renderStickers() {
        System.out.println("[Stickers] Displaying Vintage stickers: Dried flowers and wax seals.");
    }
}
