package fr.kahlouch.gameresources.resource;

import javafx.scene.image.Image;

public class SpriteSheet {
    private final Image[][] sprites;

    SpriteSheet(Image[][] sprites) {
        this.sprites = sprites;
    }

    public Image getImageAt(int x, int y) {
        return sprites[x][y];
    }

    public Image getImageAt(int idx) {
        var width = sprites.length;
        var x = idx % width;
        var height = sprites[x].length;
        var y = idx / height;
        return getImageAt(x, y);
    }
}
