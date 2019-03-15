package app;

import exampleClases.*;

public class App {

    public static void inheritanceExamples() {
        Cat misifus = new Cat("Michu", "Maria", 10, 7, "Cholo");
        Cat misifusChevere = new Cat("Hamilton el rompedor", "Maria", 10, 7, "Purasangre");

        misifus.givePetInformation();

        misifus.meow();

        System.out.println("Remaining lifes: " + misifus.getLifes());

        misifus.kill();

        System.out.println("Remaining lifes: " + misifus.getLifes());

        misifus.setLifes(5);

        System.out.println("Remaining lifes: " + misifus.getLifes());

        misifus.kill();
        misifus.kill();
        misifus.kill();
        misifus.kill();
        misifus.kill();
        misifus.kill();

        misifusChevere.givePetInformation();
        misifusChevere.kill();
        System.out.println(misifusChevere.getLifes());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("--- HashMap ussage example ---");

        collections.HashMapExample.runWithArrays();

        System.out.println("--- ArraySearch ussage example ---");
        collections.HashMapExample.runExample();

        System.out.println("--- Vowel Count Using Hash Map ---");
        collections.HashMapExample.hasMapVowelCount("murcielagoaaaeooiuuuuuu");

        System.out.println("--- Acumulator First Example ---");
        basics.AcumulatorExample.runSimpleExample();
        System.out.println("--- Acumulator Seccond Example ---");
        basics.AcumulatorExample.runSeccondExample();
        System.out.println("--- Acumulator Third Example ---");
        basics.AcumulatorExample.runEvenAsterisk();
        System.out.println("--- Acumulator String Example ---");
        basics.AcumulatorExample.stringAccumulatorExample();
        System.out.println("--- Array Vowel Count Example ---");
        basics.AcumulatorExample.firstArrayExample();

        System.out.println("--- Inheritance Example ---");
        inheritanceExamples();

        
    }
}
