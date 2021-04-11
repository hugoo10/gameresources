package gameresources.pattern.design.prototype.v4_text;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class Example {

    @Test
    public void example() throws URISyntaxException, IOException {
        Path path = Paths.get(Example.class.getClassLoader().getResource("config.json").toURI());
        JsonObject jo = new Gson().fromJson(Files.newBufferedReader(path), JsonObject.class);
        System.out.println();
    }
}
