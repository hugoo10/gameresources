package fr.kahlouch.gameresources.graphics._2d;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Graphics2D {
    final Stage stage;
    final Scene scene;
    final Group rootGroup;
    final Group gameRoot;
    Group cameraGroup;

    private Group current;
    private Group next;

    Graphics2D(Stage stage) {
        this.stage = stage;
        this.rootGroup = new Group();
        this.scene = new Scene(this.rootGroup);
        this.stage.setScene(this.scene);
        this.gameRoot = new Group();
        this.rootGroup.getChildren().add(gameRoot);
        this.cameraGroup = null;

        stage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });

        this.current = new Group();
        this.next = new Group();
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


    public void setCameraPosition(double x, double y, double z) {
        if (this.cameraGroup != null) {
            cameraGroup.setTranslateX(x);
            cameraGroup.setTranslateY(y);
            cameraGroup.setTranslateZ(z);
        }
    }

    public static Graphics2DBuilder builder(Stage stage) {
        return new Graphics2DBuilder(stage);
    }
}
