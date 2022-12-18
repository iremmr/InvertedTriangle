import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = n; i >= 0; i--) {
            for (int h = n - i; h >= 1; h--) {
                System.out.print(" ");
            }
            for (int d = 2 * i - 1; d >= 1; d--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
