module gameresources {
    requires static lombok;

    requires javafx.controls;
    requires com.google.gson;

    exports fr.kahlouch.gameresources.pattern.game_loop;
}