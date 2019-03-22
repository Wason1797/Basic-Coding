package basics;

public class Series {

    public static void fibonacci(int n) {
        int fib_prev = 1;
        int fib_term = 1;

        System.out.println(1);
        System.out.println(1);

        for (int i = 0; i < n - 2; i++) {
            int fib = fib_term + fib_prev;
            System.out.println(fib);
            fib_prev = fib_term;
            fib_term = fib;

        }
    }

    public static double factorial(double n) {
        double result = 1;
        for (int i = 2; i < n + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double b, double e) {
        double result = 0;
        double aux = b;
        for (int i = 0; i < e-1; i++) {
            result = 0;
            for (int j = 0; j < b; j++) {
                result += aux;                
            }
            aux = result;            
        }

       
        return result;
    }

}