
public class MathFunctions {

    public static void main(String[] args) {
        basicMath();
        powerAndRoots();
        roundingFunctions();
        randomNumbers();
        trigonometry();
        maxMinAbs();
        logarithms();
        degreesRadians();
    }

    // 1. Basic Arithmetic (with Math)
    static void basicMath() {
        System.out.println("\n1️⃣ Basic Arithmetic:");
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double) a / b));
        System.out.println("Modulus: " + (a % b));
    }

    // 2. Power and Roots
    static void powerAndRoots() {
        System.out.println("\n2️⃣ Power and Roots:");
        System.out.println("2^3: " + Math.pow(2, 3));        // 8.0
        System.out.println("√25: " + Math.sqrt(25));        // 5.0
        System.out.println("cbrt(27): " + Math.cbrt(27));   // 3.0
    }

    // 3. Rounding Functions
    static void roundingFunctions() {
        System.out.println("\n3️⃣ Rounding Functions:");
        double x = 5.6, y = -3.4;
        System.out.println("Ceil(5.6): " + Math.ceil(x));   // 6.0
        System.out.println("Floor(5.6): " + Math.floor(x)); // 5.0
        System.out.println("Round(5.6): " + Math.round(x)); // 6
        System.out.println("Round(-3.4): " + Math.round(y));// -3
    }

    // 4. Random Numbers
    static void randomNumbers() {
        System.out.println("\n4️⃣ Random Numbers:");
        System.out.println("Math.random(): " + Math.random()); // 0.0 - 1.0
        int randInt = (int) (Math.random() * 100); // 0 to 99
        System.out.println("Random int (0-99): " + randInt);
    }

    // 5. Trigonometry
    static void trigonometry() {
        System.out.println("\n5️⃣ Trigonometry (in radians):");
        double angle = Math.PI / 4; // 45 degrees in radians
        System.out.println("sin(π/4): " + Math.sin(angle));
        System.out.println("cos(π/4): " + Math.cos(angle));
        System.out.println("tan(π/4): " + Math.tan(angle));
    }

    // 6. Max, Min, Abs
    static void maxMinAbs() {
        System.out.println("\n6️⃣ Max, Min, and Absolute:");
        int a = 5, b = -7;
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Abs of -7: " + Math.abs(b));
    }

    // 7. Logarithms and Exponents
    static void logarithms() {
        System.out.println("\n7️⃣ Logarithms & Exponents:");
        System.out.println("log(10): " + Math.log(10));     // Natural log
        System.out.println("log10(100): " + Math.log10(100));
        System.out.println("exp(2): " + Math.exp(2));       // e^2
    }

    // 8. Degrees and Radians
    static void degreesRadians() {
        System.out.println("\n8️⃣ Degrees & Radians:");
        double deg = 90;
        double rad = Math.toRadians(deg);
        System.out.println("90° in radians: " + rad);
        System.out.println("π radians in degrees: " + Math.toDegrees(Math.PI));
    }
}
