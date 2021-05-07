package fr.kahlouch.gameresources.resource;

import fr.kahlouch.gameresources.util.ImageUtils;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

class SpriteSheetBuilder {

    private BufferedImage spriteSheet;
    private int rows;
    private int columns;

    public SpriteSheetBuilder withSheet(BufferedImage img) {
        spriteSheet = img;
        return this;
    }

    public SpriteSheetBuilder withRows(int rows) {
        this.rows = rows;
        return this;
    }

    public SpriteSheetBuilder withColumns(int columns) {
        this.columns = columns;
        return this;
    }

    public SpriteSheet build() {
        var width = spriteSheet.getWidth() / columns;
        var height = spriteSheet.getHeight() / rows;

        var sprites = new Image[columns][rows];
        for (var x = 0; x < columns; ++x) {
            for (var y = 0; y < rows; ++y) {
                sprites[x][y] = ImageUtils.convertToFxImage(spriteSheet.getSubimage(x * width, y * height, width, height));
            }
        }
        return new SpriteSheet(sprites);
    }
}
