package fr.kahlouch.gameresources.graphics._2d;

import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Graphics2DBuilder {
    private final Stage stage;
    private Camera camera;
    private Point3D cameraPosition;
    private Point2D dimension;
    private Point2D position;
    private boolean resizable;
    private boolean fullScreen;


    Graphics2DBuilder(final Stage stage) {
        this.stage = stage;
        this.camera = null;
        this.cameraPosition = null;
        this.resizable = true;
        this.fullScreen = false;
        this.dimension = null;
        this.position = null;
    }

    public Graphics2DBuilder setDimension(final double width, final double height) {
        this.dimension = new Point2D(width, height);
        return this;
    }

    public Graphics2DBuilder setPosition(final double x, final double y) {
        this.position = new Point2D(x, y);
        return this;
    }

    public Graphics2DBuilder setResizable(final boolean resizable) {
        this.resizable = resizable;
        return this;
    }

    public Graphics2DBuilder setFullScreen(final boolean fullScreen) {
        this.fullScreen = fullScreen;
        return this;
    }

    public Graphics2DBuilder addCamera(final Camera camera, double x, double y, double z) {
        this.camera = camera;
        this.cameraPosition = new Point3D(x, y, z);
        return this;
    }

    public Graphics2D build() {
        final var graphics = new Graphics2D(this.stage);
        if (this.camera != null) {
            graphics.scene.setCamera(this.camera);
            graphics.cameraGroup = new Group();
            graphics.cameraGroup.getChildren().add(camera);
            graphics.rootGroup.getChildren().add(graphics.cameraGroup);
            graphics.cameraGroup.setTranslateX(this.cameraPosition.getX());
            graphics.cameraGroup.setTranslateY(this.cameraPosition.getY());
            graphics.cameraGroup.setTranslateZ(this.cameraPosition.getZ());
        }
        if (this.dimension != null) {
            stage.setWidth(this.dimension.getX());
            stage.setHeight(this.dimension.getY());
        }
        if (this.position != null) {
            stage.setX(this.position.getX());
            stage.setY(this.position.getY());
        }
        graphics.stage.setResizable(this.resizable);
        graphics.stage.setFullScreen(this.fullScreen);
        return graphics;
    }
}
