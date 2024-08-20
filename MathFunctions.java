public class MathFunctions {
    // Statik o'zgaruvchilar --
    static double PI;
    static double E;

    // Statik blok ----
    static {
        PI = 3.14159265359;
        E = 2.71828182846;
    }

    // Doiraning yuzini hisoblash ----
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // Sonni e darajasiga oshirish ----
    public static double calculateExponent(double a) {
        return Math.pow(E, a);
    }

    // Uchburchak yuzini Geron formulasi yordamida hisoblash ----
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
