import java.util.Scanner;   

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int korkeus;
        int tahdet = 0;

        System.out.println("How many rows:");
        korkeus = input.nextInt();

        for (int i = 0; i < korkeus; i++) {
            tahdet = tahdet + 1;
            if (tahdet == 1) {
                System.out.println(" ".repeat(korkeus - tahdet) + "*".repeat(tahdet));
            }
            else {
                System.out.println(" ".repeat(korkeus - tahdet) + "*".repeat(tahdet * 2 - 1));
            }
        }
        input.close();
    }
}
