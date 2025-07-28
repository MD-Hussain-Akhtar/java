
public class StringPrograms {

    public static void main(String[] args) {
        printString();
        stringLengthAndConcat();
        compareStrings();
        reverseString();
        checkPalindrome();
        countVowelsAndConsonants();
        countWords();
        checkAnagram();
        removeDuplicates();
        stringToInteger();
        stringBuilderExample();
        charFrequency();
    }

    // 1. Print a String
    static void printString() {
        System.out.println("\n1️⃣ Print a String:");
        String str = "Hello, Java!";
        System.out.println(str);
    }

    // 2. String length, charAt, concat
    static void stringLengthAndConcat() {
        System.out.println("\n2️⃣ String Length & Concatenation:");
        String name = "Java";
        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Concat: " + name.concat(" Programming"));
    }

    // 3. Compare Strings
    static void compareStrings() {
        System.out.println("\n3️⃣ Compare Strings:");
        String a = "Java", b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Ignore case: " + a.equalsIgnoreCase(b));
        System.out.println("CompareTo: " + a.compareTo(b));
    }

    // 4. Reverse String
    static void reverseString() {
        System.out.println("\n4️⃣ Reverse String:");
        String str = "hello";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }

    // 5. Palindrome Check
    static void checkPalindrome() {
        System.out.println("\n5️⃣ Palindrome Check:");
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }

    // 6. Count Vowels and Consonants
    static void countVowelsAndConsonants() {
        System.out.println("\n6️⃣ Count Vowels & Consonants:");
        String str = "Java Programming";
        int v = 0, c = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    v++; 
                }else {
                    c++;
                }
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    // 7. Count Words
    static void countWords() {
        System.out.println("\n7️⃣ Count Words:");
        String sentence = "Java is easy to learn";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Words: " + words.length);
    }

    // 8. Anagram Check
    static void checkAnagram() {
        System.out.println("\n8️⃣ Check Anagram:");
        String a = "listen", b = "silent";
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        System.out.println(java.util.Arrays.equals(arr1, arr2) ? "Anagram" : "Not Anagram");
    }

    // 9. Remove Duplicate Characters
    static void removeDuplicates() {
        System.out.println("\n9️⃣ Remove Duplicate Characters:");
        String input = "programming", result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("Without duplicates: " + result);
    }

    // 10. Convert String to Integer
    static void stringToInteger() {
        System.out.println("\n🔟 String to Integer:");
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println("Integer value: " + n);
    }

    // 11. StringBuilder Example
    static void stringBuilderExample() {
        System.out.println("\n1️⃣1️⃣ StringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java").insert(0, "Welcome ").reverse();
        System.out.println("Result: " + sb.toString());
    }

    // 12. Character Frequency
    static void charFrequency() {
        System.out.println("\n1️⃣2️⃣ Character Frequency:");
        String str = "hello";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}
