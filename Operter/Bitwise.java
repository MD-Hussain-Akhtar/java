
public class Bitwise {

    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println(a & b);  // 1 (0001)
        System.out.println(a | b);  // 7 (0111)
        System.out.println(a ^ b);  // 6 (0110)
        System.out.println(~a);     // -6 (inverts bits)
        System.out.println(a << 1); // 10 (1010)
        System.out.println(a >> 1); // 2 (0010)
        System.out.println(a >>> 1);// 2 (unsigned right shift)

    }
}
