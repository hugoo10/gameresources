package fr.kahlouch.gameresources.graphics;

import javafx.application.Platform;
import javafx.scene.*;
import javafx.stage.Stage;

public class Graphics {
    private final Stage stage;
    private final Scene gameScene;
    private final Group cameraGroup;
    private final Group gameRoot;
    private Group current;
    private Group next;

    public Graphics(Stage stage) {
        this.stage = stage;
        this.gameRoot = new Group();
        this.cameraGroup = new Group();
        this.current = new Group();
        this.next = new Group();
        final var root = new Group();
        root.getChildren().add(gameRoot);
        this.gameScene = new Scene(root);
        setCamera(root, gameScene);
        stage.setScene(gameScene);
        stage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });

    }

    public final void startDraw() {
        next.getChildren().clear();
    }

    public final void endDraw() {
        swap();
        gameRoot.getChildren().setAll(current);
    }


    private void swap() {
        var tmp = current;
        current = next;
        next = tmp;
    }

    public final void draw(Node node) {
        this.next.getChildren().add(node);
    }

    public void show() {
        stage.show();
    }

    private void setCamera(Group root, Scene scene) {
        final Camera camera = new PerspectiveCamera(false);
        scene.setCamera(camera);
        cameraGroup.getChildren().add(camera);
        root.getChildren().add(cameraGroup);
    }

    public void setCameraPosition(double x, double y, double z) {
        cameraGroup.setTranslateX(x);
        cameraGroup.setTranslateY(y);
        cameraGroup.setTranslateZ(z);
    }
}
