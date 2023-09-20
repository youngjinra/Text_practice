package yalco.sec04.chap05;

public class Ex01 {

    static void addSubMultDiv (double a, double b){
        System.out.printf("%f + %f = %f%n", a, b, a + b);;
        System.out.printf("%f - %f = %f%n", a, b, a - b);;
        System.out.printf("%f * %f = %f%n", a, b, a * b);;
        System.out.printf("%f / %f = %f%n", a, b, a / b);;
    }
    public static void main(String[] args) {

        double x = 3, y = 4;

        System.out.printf("%f + %f = %f%n", x, y, x + y);
        System.out.printf("%f - %f = %f%n", x, y, x - y);
        System.out.printf("%f * %f = %f%n", x, y, x * y);
        System.out.printf("%f / %f = %f%n", x, y, x / y);

        System.out.println("\n--------------------\n");

        x = 10; y = 2;
        System.out.printf("%f + %f = %f%n", x, y, x+y);
        System.out.printf("%f - %f = %f%n", x, y, x-y);
        System.out.printf("%f * %f = %f%n", x, y, x*y);
        System.out.printf("%f / %f = %f%n", x, y, x/y);

        System.out.println("\n--------------------\n");

        x = 7; y = 5;

        System.out.printf("%f + %f = %f%n", x, y, x + y);
        System.out.printf("%f - %f = %f%n", x, y, x - y);
        System.out.printf("%f * %f = %f%n", x, y, x * y);
        System.out.printf("%f / %f = %f%n", x, y, x / y);

        double xx = 3, yy = 4;
        addSubMultDiv(xx, yy);

        xx = 10; yy = 2;
        addSubMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubMultDiv(xx, yy);
    }
}
