module gameresources {
    requires static lombok;

    requires javafx.controls;
    requires com.google.gson;

    exports fr.kahlouch.gameresources.controller;
    exports fr.kahlouch.gameresources.pattern.game_loop;
    exports fr.kahlouch.gameresources.input_handling;
    exports fr.kahlouch.gameresources.graphics._2d;
}