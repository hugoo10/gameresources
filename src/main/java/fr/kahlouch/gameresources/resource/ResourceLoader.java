package fr.kahlouch.gameresources.resource;

import javax.imageio.ImageIO;
import java.io.IOException;

public abstract class ResourceLoader {
    protected SpriteSheet loadSprites(final String spriteFileName, final int nbRows, final int nbColumns) {
        final var spriteFileUrl = ResourceLoader.class.getClassLoader().getResource(spriteFileName);
        try {
            final var sprite = ImageIO.read(spriteFileUrl);
            return new SpriteSheetBuilder()
                    .withSheet(sprite)
                    .withColumns(nbColumns)
                    .withRows(nbRows)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract void loadResource();
}
