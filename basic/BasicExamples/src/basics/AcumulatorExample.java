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

    public static void multipleDetection() {
        int limit = 20;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0)
                System.out.println(i + " Es multiplo de 2");
            else if (i % 3 == 0)
                System.out.println(i + " Es multiplo de 3");
            else if (i % 5 == 0)
                System.out.println(i + " Es multoplo de 5");
        }
    }

    public static void firstArrayExample() {
        String sentence = "aaaaaaaaaccccceeeecceceeecooooisiiisisi";
        int[] vowelCount = { 0, 0, 0, 0, 0 };
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        String sentenceUper = sentence.toUpperCase();

        System.out.println(sentence);
        System.out.println(sentenceUper);

        for (int i = 0; i < sentence.length(); i++) {
            char selected = sentence.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (selected == vowels[j])
                    vowelCount[j] += 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("El numero de letras " + vowels[i] + " es: " + vowelCount[i]);
        }
    }
}