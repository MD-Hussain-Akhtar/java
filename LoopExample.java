
public class LoopExample {

    public static void main(String[] args) {
        System.out.println("1️⃣ For Loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For: " + i);
        }

        System.out.println("\n2️⃣ While Loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("While: " + j);
            j++;
        }

        System.out.println("\n3️⃣ Do-While Loop:");
        int k = 1;
        do {
            System.out.println("Do-While: " + k);
            k++;
        } while (k <= 3);

        System.out.println("\n4️⃣ Enhanced For Loop:");
        String[] names = {"Java", "Python", "C++"};
        for (String name : names) {
            System.out.println("Language: " + name);
        }
    }
}
