package module2.datatypes;

/**
 *  Floating-point numbers may exhibit unexpected behavior.
 */

public class FloatAbnormalities {
    public static void main(String[] args) {

        // Example 1
        double a = 1.0f;
        double b = 0.33f;
        double sum = 1.33d;

        System.out.printf("a + b = %f\n", a + b);
        System.out.printf("sum = %f\n", sum);
        System.out.println("a + b == sum --> " + (a + b == sum));

        // Due to precision differences, sum of a & b != value of sum

        // Example 2
        double num = 0;
        for (int i = 0; i < 10000; i++) {
            num += 0.0001;
        }
        System.out.println(num);
    }
}
