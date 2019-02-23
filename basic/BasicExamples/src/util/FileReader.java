package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileReader {
    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    public ArrayList<String> getAllLines() throws IOException {

        return Files.lines(Paths.get(path)).collect(Collectors.toCollection(ArrayList::new));

    }
}