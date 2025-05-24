import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Нэрээ оруул: ");
        String name = input.nextLine();

        System.out.print("Насаа оруул: ");
        int age = input.nextInt();

        if ( age >= 18) {
            System.out.println("Сайн байна уу, " + name + "! Та насанд хүрсэн байна.");
        } else {
            System.out.println("Сайн байна уу,"+ name + "! Та насанд хүрээгүй байна.");
        }
    }
}
