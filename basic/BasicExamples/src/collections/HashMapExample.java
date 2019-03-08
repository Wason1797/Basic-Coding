package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import util.FileReader;

public class HashMapExample {

    public static void runExample() {
        try {
            String filePath = "D:\\wason\\Documents\\Trabajos Universidad\\Proyectos y Soluciones\\Basic-Coding\\basic\\ExampleFiles\\inputExample.txt";
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
