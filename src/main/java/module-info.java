module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports pl.f2s.mp3player.main to javafx.graphics;
    opens pl.f2s.mp3player.controller to javafx.fxml;
    opens pl.f2s.mp3player.mp3 to javafx.base;
}