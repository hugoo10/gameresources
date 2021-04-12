package gameresources.pattern.design.singleton.v6_from_already_global;

import javax.sound.sampled.AudioInputStream;
import java.nio.file.FileSystem;
import java.util.logging.Logger;

class Game {
    private static final Game instance = new Game();
    private Logger log;
    private FileSystem fileSystem;
    private AudioInputStream audioPlayer;

    public static Game instance() {
        return instance;
    }

    public Logger getLog() {
        return log;
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }

    public AudioInputStream getAudioPlayer() {
        return audioPlayer;
    }
}
