package gameresources.pattern.design.singleton.v2_subclass;

abstract class FileSystem {
    private static FileSystem instance;

    static FileSystem instance() {
        if ("PLATFORM" == "PLAYSTATION3") instance = new PS3FileSystem();
        else if ("PLATFORM" == "WII") instance = new WiiFileSystem();
        return instance;
    }

    protected FileSystem() {
    }

    protected abstract String readFile(String path);

    protected abstract void writeFile(String path, String content);
}
