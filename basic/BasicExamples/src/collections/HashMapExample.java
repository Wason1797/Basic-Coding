package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import util.FileReader;

public class HashMapExample {

    private static String filePath = "D:\\wason\\Documents\\Trabajos Universidad\\Proyectos y Soluciones\\Basic-Coding\\basic\\ExampleFiles\\inputExample.txt";

    public static void runExample() {
        try {
            ArrayList<String> inputLines = new FileReader(filePath).getAllLines();
            HashMap<String, Integer> personCounterMap = new HashMap<>();
            long startTime = System.nanoTime();
            for (String x : inputLines) {
                String[] separatedLine = x.split(",");
                String personKey = separatedLine[0];
                Integer personValue = Integer.parseInt(separatedLine[1]);
                if (personCounterMap.containsKey(personKey)) {
                    int currentValue = personCounterMap.get(personKey);
                    personCounterMap.replace(personKey, currentValue + personValue);

                } else {
                    personCounterMap.put(personKey, personValue);
                }
            }
            StringBuilder displayMessage = new StringBuilder();
            personCounterMap.forEach((key, value) -> {
                displayMessage.append("The client: " + key + " spent: " + value + " USD\n");
            });
            System.out.println(displayMessage.toString().trim());
            long endTime = System.nanoTime();
            System.out.println("Elapsed time: " + (endTime - startTime) / 1000000);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void runWithArrays() {
        ArrayList<String> inputLines;
        try {
            inputLines = new FileReader(filePath).getAllLines();

            ArrayList<String> personNames = new ArrayList<>();
            ArrayList<Integer> personValues = new ArrayList<>();
            long startTime = System.nanoTime();
            for (int i = 0; i < inputLines.size(); i++) {
                String[] separatedLine = inputLines.get(i).split(",");
                String personName = separatedLine[0];
                Integer personCount = Integer.parseInt(separatedLine[1]);
                int index = personNames.indexOf(personName);
                if (index == -1) {
                    personNames.add(personName);
                    personValues.add(personCount);
                } else {
                    Integer currentCount = personValues.get(index) + personCount;
                    personValues.remove(index);
                    personValues.add(index, currentCount);
                }
            }

            for (int i = 0; i < personValues.size(); i++) {
                System.out.println("The client: " + personNames.get(i) + " spent: " + personValues.get(i) + " USD");
            }
            long endTime = System.nanoTime();
            System.out.println("Elapsed time: " + (endTime - startTime) / 1000000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void hasMapVowelCount(String sentence)
    {
        HashMap<String, Integer>vowelCounter = new HashMap<>();
        vowelCounter.put("a", 0);
        vowelCounter.put("e", 0);
        vowelCounter.put("i", 0);
        vowelCounter.put("o", 0);
        vowelCounter.put("u", 0);

        for(int i=0; i<sentence.length();i++)
        {
            String letter = Character.toString(sentence.charAt(i));
            if(vowelCounter.containsKey(letter))
            {
                int current = vowelCounter.get(letter);
                vowelCounter.replace(letter,current+1);
            }
        }
        vowelCounter.forEach((k,v) ->{
            System.out.println("Letter "+ k+ " was found "+v +" times");
        });
    }
}
