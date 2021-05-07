package fr.kahlouch.gameresources.util;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.awt.image.BufferedImage;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ImageUtils {
    public static Image convertToFxImage(BufferedImage image) {
        WritableImage wr = null;
        if (image != null) {
            wr = new WritableImage(image.getWidth(), image.getHeight());
            var pw = wr.getPixelWriter();
            for (var x = 0; x < image.getWidth(); x++) {
                for (var y = 0; y < image.getHeight(); y++) {
                    pw.setArgb(x, y, image.getRGB(x, y));
                }
            }
        }
        return new ImageView(wr).getImage();
        //return wr;
    }
}
