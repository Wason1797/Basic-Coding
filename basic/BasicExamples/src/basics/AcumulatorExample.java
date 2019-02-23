package basics;

public class AcumulatorExample {

    public static void runSimpleExample() {
        int sum = 0;
        int limit = 21;
        for (int i = 1; i < limit; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void runSeccondExample() {
        int evenSum = 0;
        int limit = 20;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                evenSum++;
            }
        }
        System.out.println("The ammount of even numbers is: " + evenSum);
    }

    public static void runThirdExample() {
        int evenSum = 0;
        int limit = 20;
        for (int i = 2; i <= limit; i += 2) {
            evenSum++;
        }
        System.out.println("The ammount of even numbers is: " + evenSum);
    }

    public static void runEvenAsterisk() {
        int limit = 20;
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0)
                System.out.println(i + "*");
            else
                System.out.println(i);
        }
    }

    public static void stringAccumulatorExample() {
        String sentence = "";
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            sentence = sentence + i + " ";
        }
        sentence = sentence.trim();
        System.out.println(sentence);

    }
}