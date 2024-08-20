public class RightTriangle {
    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateHypotenuse() {
        return Math.sqrt(a * a + b * b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String toString() {
        return "RightTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", hypotenuse=" + calculateHypotenuse() +
                '}';
    }
}
