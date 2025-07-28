
public class ArrayExample {

    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Access elements using index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3. Loop through array using for loop
        System.out.println("\nAll elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 4. Enhanced for loop
        System.out.println("\nAll elements using for-each:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 5. Sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum = " + sum);

        // 6. Modify an element
        numbers[2] = 99;
        System.out.println("\nUpdated element at index 2: " + numbers[2]);
    }
}
