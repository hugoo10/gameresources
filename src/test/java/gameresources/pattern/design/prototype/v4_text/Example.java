package gameresources.pattern.design.prototype.v4_text;


import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public void example() throws URISyntaxException, IOException {
        Path path = Paths.get("path_to_json");
        JsonObject jo = new Gson().fromJson(Files.newBufferedReader(path), JsonObject.class);
        System.out.println();
    }
}
