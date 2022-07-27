package me.gixu.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Delete {
    private void delete(String fileLocation) throws IOException {
        if (Files.exists(Path.of(fileLocation))){
            Files.deleteIfExists(Path.of(fileLocation));
            return;
        }
        else {
            throw new FileNotFoundException("File not found");
        }
    }

    public void remove(String fileLocation) throws IOException {
        delete(fileLocation);
    }

}
