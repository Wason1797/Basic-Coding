import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

class FileReader {
    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    public ArrayList<String> getAllLines() throws IOException {

        return Files.lines(Paths.get(path)).collect(Collectors.toCollection(ArrayList::new));

    }
}

public class HashMapExample {

    public static void main(String[] args) {
        try {
            String filePath = "data-structures\\HashBased\\inputExample.txt";
            ArrayList<String> inputLines = new FileReader(filePath).getAllLines();
            HashMap<String, Integer> personCounterMap = new HashMap<>();
            inputLines.forEach(x -> {
                String[] separatedLine = x.split(",");
                String personKey = separatedLine[0];
                Integer personValue = Integer.parseInt(separatedLine[1]);
                if (personCounterMap.containsKey(personKey)) {
                    int currentValue = personCounterMap.get(personKey);
                    personCounterMap.replace(personKey, currentValue + personValue);

                } else {
                    personCounterMap.put(personKey, personValue);
                }
            });
            StringBuilder displayMessage = new StringBuilder();
            personCounterMap.forEach((key, value) -> {
                displayMessage.append("The client: " + key + " spent: " + value + " USD\n");
            });
            System.out.println(displayMessage.toString().trim());
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}