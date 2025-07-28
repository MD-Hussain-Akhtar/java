
public class BooleanExamples {

    public static void main(String[] args) {
        basicBoolean();
        booleanComparison();
        logicalOperators();
        booleanInConditions();
        booleanWithMethods();
    }

    // 1. Basic Boolean Declaration
    static void basicBoolean() {
        System.out.println("\n1️⃣ Basic Boolean:");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
    }

    // 2. Boolean from Comparison
    static void booleanComparison() {
        System.out.println("\n2️⃣ Boolean from Comparison:");
        int a = 10, b = 20;
        boolean result = a < b;
        System.out.println("Is a < b? " + result); // true
    }

    // 3. Logical Operators with Booleans
    static void logicalOperators() {
        System.out.println("\n3️⃣ Logical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false
    }

    // 4. Booleans in if-else Condition
    static void booleanInConditions() {
        System.out.println("\n4️⃣ Booleans in Conditions:");
        boolean isLoggedIn = true;
        if (isLoggedIn) {
            System.out.println("Welcome, user!");
        } else {
            System.out.println("Please login.");
        }
    }

    // 5. Boolean Returned by Method
    static void booleanWithMethods() {
        System.out.println("\n5️⃣ Boolean from Method:");
        int num = 9;
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
