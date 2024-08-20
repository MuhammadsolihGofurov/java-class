public class Main {
    public static void main(String[] args) {
        // Doira yuzini hisoblash---
        double radius = 5.0;
        double circleArea = MathFunctions.calculateCircleArea(radius);
        System.out.println("Doiraning yuzi: " + circleArea);

        // e ni darajaga oshirish --
        double exponent = 2.0;
        double result = MathFunctions.calculateExponent(exponent);
        System.out.println("e^" + exponent + " = " + result);

        // Uchburchak yuzini hisoblash (Geron formulasi) --
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double triangleArea = MathFunctions.calculateTriangleArea(a, b, c);
        System.out.println("Uchburchakning yuzi: " + triangleArea);
    }
}
